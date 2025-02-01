package com.uisrael.legalprosglpweb.services.impl;

import com.uisrael.legalprosglpweb.models.LegalCases;
import com.uisrael.legalprosglpweb.repositories.LegalCasesRepository;
import com.uisrael.legalprosglpweb.services.LegalCasesService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LegalCasesServiceImpl extends GenericServiceImpl<LegalCases, Long> implements LegalCasesService {
    public LegalCasesServiceImpl(LegalCasesRepository repo){
        super(repo);
    }
}
