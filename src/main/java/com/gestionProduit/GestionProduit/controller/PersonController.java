package com.gestionProduit.GestionProduit.controller;

import com.gestionProduit.GestionProduit.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/v1/uses")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;
}
