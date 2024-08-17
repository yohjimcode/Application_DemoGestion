package com.DemoGestion.repositories;

import com.DemoGestion.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional //délégue le gestion du cycle de vie de l'entité à Transactional
public interface CategoryRepository extends JpaRepository<Category, Long> { //<entities:Users, id:Integer
}
