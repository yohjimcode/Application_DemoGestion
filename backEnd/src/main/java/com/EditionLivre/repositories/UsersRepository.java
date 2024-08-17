package com.EditionLivre.repositories;

import com.EditionLivre.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional //délégue le gestion du cycle de vie de l'entité à Transactional
public interface UsersRepository extends JpaRepository<Users, Integer> { //<entities:Users, id:Integer
}
