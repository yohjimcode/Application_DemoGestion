package Maison.EditionLivres.rest.service;

import Maison.EditionLivres.base.adaptaters.LivreJpaRepository;
import Maison.EditionLivres.base.entities.LivreModel;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LivreService implements LivreServiceInterface {

    private final LivreJpaRepository livreJpaRepository;

    public LivreService(LivreJpaRepository livreJpaRepository) {
        this.livreJpaRepository = livreJpaRepository;
    }

    @Override
    public List<LivreModel> findAll() {
        return this.livreJpaRepository.findAll();
    }

    @Override
    public void deleteLivre(long id) {
        this.livreJpaRepository.deleteById(id);
    }

    @Override
    public LivreModel findLivre(long id) {
        return this.livreJpaRepository.getReferenceById(id);
    }

    @Override
    public void createLivre(LivreModel livreModel) {
        this.livreJpaRepository.save(livreModel);
    }

    @Override
    public void editLivre(LivreModel livreModel, long id) {
        LivreModel livre = this.livreJpaRepository.getReferenceById(id);

        livre.setTitre(livre.getTitre());
        livre.setAuteur(livre.getAuteur());
        livre.setImageLivre(livre.getImageLivre());
        livre.setDateParution(livre.getDateParution());
        livre.setResume(livre.getResume());
        livre.setPrix(livre.getPrix());
        livre.setRecommandation(livre.getRecommandation());

        this.livreJpaRepository.save(livre);
    }
}
