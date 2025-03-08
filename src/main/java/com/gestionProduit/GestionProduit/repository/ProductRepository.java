package com.gestionProduit.GestionProduit.repository;

import com.gestionProduit.GestionProduit.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }
