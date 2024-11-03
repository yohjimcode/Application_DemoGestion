package Maison.EditionLivres.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivreDto {

    private long id;
    private String titre;
    private String auteur;
    private String imageLivre;
    private Date dateParution;
    private String resume;
    private double prix;
    private Long recommandation;
}

