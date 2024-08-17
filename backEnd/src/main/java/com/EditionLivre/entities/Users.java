package com.EditionLivre.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_users")
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="identifiant", nullable = false)
    private String identifiant;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="pseudo", nullable = false, length = 32)
    private String pseudo;

    @Column(name="role", nullable = false, length = 50)
    private String role;
}
