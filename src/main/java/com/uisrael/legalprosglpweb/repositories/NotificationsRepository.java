package com.uisrael.legalprosglpweb.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.uisrael.legalprosglpweb.models.Notifications;

@Repository
public interface NotificationsRepository extends GenericRepository<Notifications, Long> {
    List<Notifications> findByLegalCaseId(Long legalCaseId);
}
