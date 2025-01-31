package com.uisrael.legalprosglpweb.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.uisrael.legalprosglpweb.models.LegalDeadline;

@Repository
public interface LegalDeadlineRepository extends GenericRepository<LegalDeadline, Long> {
    List<LegalDeadline> findByLegalCaseId(Long legalCaseId);
}
