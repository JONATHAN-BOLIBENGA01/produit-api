package com.gestionProduit.GestionProduit.services;

import com.gestionProduit.GestionProduit.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
}
