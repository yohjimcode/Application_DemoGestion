package Maison.EditionLivres.base.adaptaters;

import Maison.EditionLivres.base.entities.LivreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional

public interface LivreJpaRepository extends JpaRepository<LivreModel,Long> {

}
