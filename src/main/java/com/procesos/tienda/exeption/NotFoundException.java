package com.procesos.tienda.exeption;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
