package com.uisrael.legalprosglpweb.controllers;

import com.uisrael.legalprosglpweb.models.LegalCases;
import com.uisrael.legalprosglpweb.services.LegalCasesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/legalCase")
public class LegalCasesController{

    private final LegalCasesService legalCasesService;

    public LegalCasesController(LegalCasesService legalCasesService) {
        this.legalCasesService = legalCasesService;
    }

    @PostMapping
    public ResponseEntity<LegalCases> createClient(@RequestBody LegalCases legalCases) {
        return ResponseEntity.ok(legalCasesService.save(legalCases));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LegalCases> updateClient(@PathVariable Long id, @RequestBody LegalCases legalCases) {
        if (!legalCasesService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        //legalCases.setId(id); // Asegurar que la ID es la misma
        legalCases.setDescription(legalCases.getDescription());
        return ResponseEntity.ok(legalCasesService.save(legalCases));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        if (!legalCasesService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        legalCasesService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
