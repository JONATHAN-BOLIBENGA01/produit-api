package com.gestionProduit.GestionProduit.productExceptions;

public class ProductNotFoundException extends  RuntimeException {

    public ProductNotFoundException(String message) {
        super(message); // ici message est passer  a la RuntimeException
    }
}
