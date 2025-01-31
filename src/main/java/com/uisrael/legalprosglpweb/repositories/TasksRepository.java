package com.uisrael.legalprosglpweb.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.uisrael.legalprosglpweb.models.Tasks;

@Repository
public interface TasksRepository extends GenericRepository<Tasks, Long> {
    List<Tasks> findByLegalCaseId(Long legalCaseId);
}
