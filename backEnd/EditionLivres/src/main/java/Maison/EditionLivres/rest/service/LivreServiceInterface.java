package Maison.EditionLivres.rest.service;

import Maison.EditionLivres.base.entities.LivreModel;

import java.util.List;

public interface LivreServiceInterface {

    List<LivreModel> findAll();

    void createLivre(LivreModel livreModel);

    void editLivre(LivreModel livreModel, long id);

    void deleteLivre(long id);

    LivreModel findLivre(long id);

}
