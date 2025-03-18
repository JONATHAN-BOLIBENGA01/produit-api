package com.gestionProduit.GestionProduit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "produits")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String name;
    private double price;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "productCategory",
            joinColumns = @JoinColumn(name = "product_Id"),
            inverseJoinColumns = @JoinColumn(name = "category_Id")
    ) // la table de jointure
    private List<Category> categoryList;

}
