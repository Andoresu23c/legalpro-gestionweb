package com.uisrael.legalprosglpweb.controllers;

import com.uisrael.legalprosglpweb.models.LegalCases;
import com.uisrael.legalprosglpweb.services.LegalCasesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cases")
public class LegalCasesController extends GenericController<LegalCases, Long> {

    private final LegalCasesService legalCasesService;

    public LegalCasesController(LegalCasesService legalCasesService) {
        super(legalCasesService);
        this.legalCasesService = legalCasesService;
    }

    @PostMapping("/create")
    public ResponseEntity<LegalCases> createCase(@RequestBody LegalCases legalCase) {
        legalCase.setCaseCode(legalCasesService.generateUniqueCaseCode());
        return ResponseEntity.ok(legalCasesService.save(legalCase));
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<LegalCases>> getCasesByClient(@PathVariable Long clientId) {
        return ResponseEntity.ok(legalCasesService.findByClientId(clientId));
    }
}
