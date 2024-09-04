package com.DemoGestion.services;

import com.DemoGestion.entities.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);

    List<Product> findAll();

    void deleteProduct(long id);

    Product editProduct(Product product, long id);

    Product findProduct(long id);

}
