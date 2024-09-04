package com.DemoGestion.services;

import com.DemoGestion.entities.Product;
import com.DemoGestion.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{

    private ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public void deleteProduct(long id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public Product editProduct(Product product, long id) {
        Product p = this.productRepository.getReferenceById(id); //On charge les reference par rappor tà l'ID
        p.setCategory(product.getCategory()); // On modifie la catégorie, on charge la catégorie qu'on veut setter
        //p.setCode(product.getCode());
        p.setTitle(product.getTitle());
        p.setPrice(product.getPrice());
        this.productRepository.save(p); //On sauvegarde les modifications faite aux set
        return p; // on retourne le product p setter
    }

    @Override
    public Product findProduct(long id) {
        return this.productRepository.getReferenceById(id);
    }
}
