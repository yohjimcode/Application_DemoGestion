package Maison.EditionLivres.base.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Livre")
public class LivreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "referenceNumber")
    private long id;
    private String titre;
    //Relation OneToMany Auteur
    private String auteur;
    private String imageLivre;
    private Date dateParution;
    private String resume;
    private double prix;
    private Long recommandation;

}
