package com.gestionProduit.GestionProduit.repository;

import com.gestionProduit.GestionProduit.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
