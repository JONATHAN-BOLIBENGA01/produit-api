package com.gestionProduit.GestionProduit.controller;

import com.gestionProduit.GestionProduit.model.Product;
import com.gestionProduit.GestionProduit.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;


    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable long id) /*PathVariable pour dire que c'est une variable passer au niveau de l'url */
    {
        return productService.getProductById(id);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


    @PutMapping("{id}")
    public Product editProduct(@PathVariable long id, @RequestBody Product product){
        return productService.editProduct(id, product);
    }


    @DeleteMapping("{id}")
    public String deleteProductById(@PathVariable("id") long idProduct) {
        return productService.deleteProductById(idProduct);
    }

}
