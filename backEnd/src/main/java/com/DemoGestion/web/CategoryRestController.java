package com.DemoGestion.web;

import com.DemoGestion.entities.Category;
import com.DemoGestion.models.CategoryModel;
import com.DemoGestion.services.CategoryService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryRestController {


    final CategoryService categoryService;
    CategoryRestController( final CategoryService categoryService){
        this.categoryService  = categoryService;
    }

    /*
        ligne 13 à 16 -> on peut utiliser @Autowired mais cette méthode est préférée.
        Ces lignes font de la classe un BEAN
     */

    @PostMapping("/categories")
    void createCategory(@RequestBody @Validated CategoryModel categoryModel){
        Category category = new Category();
        category.setDesignation(categoryModel.getDesignation());

        this.categoryService.createCategory(category);
    }

    @GetMapping("/categories")
    List<Category> findAllCategories(){
      return this.categoryService.findAll();
    }

    @DeleteMapping("/categories/{id}")
    void deleteCategory(@PathVariable("id") long id){
        this.categoryService.deleteCategory(id);
    }

}
