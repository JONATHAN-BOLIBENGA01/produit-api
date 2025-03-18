package com.gestionProduit.GestionProduit.repository;

import com.gestionProduit.GestionProduit.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
