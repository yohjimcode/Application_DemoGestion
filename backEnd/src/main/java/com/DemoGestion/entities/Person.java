package com.DemoGestion.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

// pas de Constructor car classe abstraite, classe non instanciable
// Une personne contient un cleint ou un provider, d'où la classe abstraite

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  //Inheritance -> Héritage, SINGLE_TABLE -> Table unique (pas de jointure,... )
@DiscriminatorColumn(name = "person_type",
    discriminatorType = DiscriminatorType.INTEGER)
public abstract class Person implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telephone;
    @Column(length = 100)
    private String address;
}
