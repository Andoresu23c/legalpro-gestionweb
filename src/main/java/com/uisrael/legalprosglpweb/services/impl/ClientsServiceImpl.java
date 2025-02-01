package com.uisrael.legalprosglpweb.services.impl;

import com.uisrael.legalprosglpweb.models.Clients;
import com.uisrael.legalprosglpweb.repositories.ClientsRepository;
import com.uisrael.legalprosglpweb.services.ClientsService;
import org.springframework.stereotype.Service;

@Service
public class ClientsServiceImpl extends GenericServiceImpl<Clients, Long> implements ClientsService {
    public ClientsServiceImpl(ClientsRepository repo){
        super(repo);
    }
}
