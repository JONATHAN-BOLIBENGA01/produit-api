package com.gestionProduit.GestionProduit.services;

import com.gestionProduit.GestionProduit.model.Product;
import com.gestionProduit.GestionProduit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;



    public  Product createProduct(Product product) {
        return  productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isEmpty()) throw new RuntimeException("Desole produit inexistant !");
        return optionalProduct.get(); // pour recuper et retourner le produit s'il est present
    }


    public String deleteProductById(long idProduct) {
        Optional<Product> optionalProduct = productRepository.findById(idProduct);

        if (optionalProduct.isEmpty())  throw new RuntimeException("supression impossible : Produit inexistant !");

        productRepository.delete(optionalProduct.get());

        return "produit suprimer avec succes !";
    }

    public Product editProduct(long id, Product product) {
            Optional<Product> optionalProduct = productRepository.findById(id);

            if (optionalProduct.isEmpty()) throw new RuntimeException("Modification impossible !");
            Product productToEdit = optionalProduct.get();

            productToEdit.setName(product.getName());
            productToEdit.setPrice(product.getPrice());

            return  productRepository.save(productToEdit);
    }
}
