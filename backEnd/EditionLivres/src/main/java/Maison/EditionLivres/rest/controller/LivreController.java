package Maison.EditionLivres.rest.controller;

import Maison.EditionLivres.base.entities.LivreModel;
import Maison.EditionLivres.rest.dto.LivreDto;
import Maison.EditionLivres.rest.service.LivreServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edition")
public class LivreController {

    private final LivreServiceInterface livreService;

    public LivreController(LivreServiceInterface livreService) {
        this.livreService = livreService;
    }

    @GetMapping("/livres")
    List<LivreModel> findAll(){
        return this.livreService.findAll();
    }

    @DeleteMapping("/livres/{id}")
    void deleteLivre(@PathVariable("id") long id){
        this.livreService.deleteLivre(id);
    }

    @PostMapping("/livres")
    void createLivre(@RequestBody LivreDto livreDto){
        LivreModel livre = new LivreModel();
        livre.setTitre(livreDto.getTitre());
        livre.setAuteur(livreDto.getAuteur());
        livre.setImageLivre(livreDto.getImageLivre());
        livre.setDateParution(livreDto.getDateParution());
        livre.setResume(livreDto.getResume());
        livre.setPrix(livreDto.getPrix());

        this.livreService.createLivre(livre);
    }

}
