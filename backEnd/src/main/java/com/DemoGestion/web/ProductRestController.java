package com.DemoGestion.web;

import com.DemoGestion.entities.Product;
import com.DemoGestion.models.ProductModel;
import com.DemoGestion.services.CategoryService;
import com.DemoGestion.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRestController {

    private ProductService productService;
    private CategoryService categoryService;

    @PostMapping("/product")
    void createProduct(@RequestBody @Validated ProductModel productModel){
        Product product = new Product();
        product.setTitle(productModel.getTitle());
        product.setCategory(this.categoryService.findOne(productModel.getCategoryId()));
        product.setPrice(productModel.getPrice());
        product.setCode(productModel.getCode());

        this.productService.createProduct(product);
    }

    @GetMapping("/product")
    List<Product> findAll(){
        return this.productService.findAll();
    }

    @DeleteMapping("/product/{id}")
    void deleteProduct(@PathVariable @Validated long id){
        this.productService.deleteProduct(id);
    }
}
