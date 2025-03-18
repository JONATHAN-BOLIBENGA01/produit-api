package com.gestionProduit.GestionProduit.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long person_id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "person")
    private Set<Adresse> adresseList; //un set pour une list sans doublons>
}
