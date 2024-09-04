package com.DemoGestion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data //Génére getters et setters auto
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "t_users")
public class Category implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 60)
    private String designation;
    private String description;

    @OneToMany(mappedBy = "category")
    Collection<Product> products = new ArrayList<>();



}
