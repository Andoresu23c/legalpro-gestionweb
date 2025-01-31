package com.uisrael.legalprosglpweb.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.uisrael.legalprosglpweb.models.LegalCases;

@Repository
public interface LegalCasesRepository extends GenericRepository<LegalCases, Long> {
    List<LegalCases> findByClientId(Long clientId);
    boolean existsByCaseCode(String caseCode);
}


