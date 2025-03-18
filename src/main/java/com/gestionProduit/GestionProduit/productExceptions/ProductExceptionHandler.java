package com.gestionProduit.GestionProduit.productExceptions;
//cette class handler est la pour s'occuper de l'envoie de message au cas d'erreur


import com.gestionProduit.GestionProduit.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice //cette anotation surveille en sois notre api pour detecter les err
public class ProductExceptionHandler {

     @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerProductNotFoundException(ProductNotFoundException pex){
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                pex.getMessage()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}

