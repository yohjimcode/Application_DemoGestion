package com.DemoGestion.services;

import com.DemoGestion.entities.Category;
import com.DemoGestion.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements  CategoryService{

    //ON injecte le
    private final CategoryRepository categoryRepository;


    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void createCategory(Category category) {
        this.categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(long id) {
        this.categoryRepository.deleteById(id);
    }

    @Override
    public void editCategory(Category category, long id) {
        Category c = this.categoryRepository.getReferenceById(id);
        c.setDesignation(category.getDesignation());
        this.categoryRepository.save(c);
    }

    @Override
    public Category findOne(long id) {
        return this.categoryRepository.getReferenceById(id);
    }
}
