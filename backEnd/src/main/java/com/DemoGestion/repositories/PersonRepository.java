package com.DemoGestion.repositories;

import com.DemoGestion.entities.Client;
import com.DemoGestion.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PersonRepository extends JpaRepository<Person, Long> {
    //gére l'entité client et l'entité fournisseur
}
