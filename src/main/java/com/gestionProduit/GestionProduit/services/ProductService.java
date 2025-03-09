package com.gestionProduit.GestionProduit.services;

import com.gestionProduit.GestionProduit.model.Product;
import com.gestionProduit.GestionProduit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public  Product createProduct(Product product) {
        return  productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
