package com.uisrael.legalprosglpweb.controllers;

import com.uisrael.legalprosglpweb.models.Clients;
import com.uisrael.legalprosglpweb.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientsController {

    private final ClientsService clientsService;

    public ClientsController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @GetMapping
    public ResponseEntity<List<Clients>> getAllClients() {
        return ResponseEntity.ok(clientsService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clients> getClientById(@PathVariable Long id) {
        Optional<Clients> client = clientsService.findById(id);
        return client.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Clients> createClient(@RequestBody Clients client) {
        return ResponseEntity.ok(clientsService.save(client));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clients> updateClient(@PathVariable Long id, @RequestBody Clients client) {
        Optional<Clients> existingClientOpt = clientsService.findById(id);

        if (!existingClientOpt.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Clients existingClient = existingClientOpt.get();

        // Actualizar solo los campos necesarios (sin modificar el ID)
        existingClient.setDocumentType(client.getDocumentType());
        existingClient.setDocument(client.getDocument());
        existingClient.setName(client.getName());
        existingClient.setLastName(client.getLastName());
        existingClient.setEmail(client.getEmail());
        existingClient.setPhone(client.getPhone());

        // Guardar el cliente actualizado
        return ResponseEntity.ok(clientsService.save(existingClient));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        if (!clientsService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        clientsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
