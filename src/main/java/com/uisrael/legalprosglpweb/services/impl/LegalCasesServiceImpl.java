package com.uisrael.legalprosglpweb.services.impl;

import com.uisrael.legalprosglpweb.models.LegalCases;
import com.uisrael.legalprosglpweb.repositories.LegalCasesRepository;
import com.uisrael.legalprosglpweb.services.LegalCasesService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LegalCasesServiceImpl extends GenericServiceImpl<LegalCases, Long> implements LegalCasesService {

    private final LegalCasesRepository legalCasesRepository;

    public LegalCasesServiceImpl(LegalCasesRepository legalCasesRepository) {
        super(legalCasesRepository); 
        this.legalCasesRepository = legalCasesRepository;
    }

    @Override
    public String generateUniqueCaseCode() {  
        String generatedCode;
        do {
            generatedCode = "CASE-" + java.util.UUID.randomUUID().toString().substring(0, 8);
        } while (legalCasesRepository.existsByCaseCode(generatedCode));
        return generatedCode;
    }

    @Override
    public List<LegalCases> findByClientId(Long clientId) {
        return legalCasesRepository.findByClientId(clientId);
    }
}
