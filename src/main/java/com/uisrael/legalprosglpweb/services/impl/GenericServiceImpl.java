package com.uisrael.legalprosglpweb.services.impl;

import com.uisrael.legalprosglpweb.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public class GenericServiceImpl<T, ID> implements GenericService<T, ID> {
    @Autowired
    private JpaRepository<T, ID> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
