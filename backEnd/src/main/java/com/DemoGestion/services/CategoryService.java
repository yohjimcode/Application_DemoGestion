package com.DemoGestion.services;

import com.DemoGestion.entities.Category;

import java.util.List;

public interface CategoryService {

    void createCategory(Category category);

    List<Category> findAll();

    void deleteCategory(long id);

    void editCategory(Category category, long id);

    Category findOne(long id);

}
