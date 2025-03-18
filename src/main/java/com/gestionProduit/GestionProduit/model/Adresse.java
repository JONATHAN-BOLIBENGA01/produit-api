package com.gestionProduit.GestionProduit.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adresse_id;
    private String street;
    private String city;
    private String state;

    @ManyToOne
    @JoinColumn(name = "id")
    private Person person;
}
