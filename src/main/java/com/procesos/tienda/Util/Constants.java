package com.procesos.tienda.Util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.yaml.snakeyaml.scanner.Constant;

@Getter
public enum Constants {
    USER_NOT_FOUND("User not found"),
    ADDRESS_NOT_FOUND("Address not found");

    private String message;
    Constants (String s){
        this.message=s;
    }
}
