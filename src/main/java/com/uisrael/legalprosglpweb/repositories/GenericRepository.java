package com.uisrael.legalprosglpweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository extends JpaRepository<T, ID> {

}
