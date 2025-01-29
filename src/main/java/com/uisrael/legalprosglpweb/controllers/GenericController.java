package com.uisrael.legalprosglpweb.controllers;

import com.uisrael.legalprosglpweb.services.GenericService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public abstract class GenericController<T,ID> {
    protected final GenericService<T,ID> service;

    public GenericController(GenericService<T, ID> service){
        this.service = service;
    }

    @GetMapping
    public List<T> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")

}
