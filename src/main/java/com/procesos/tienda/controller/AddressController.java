package com.procesos.tienda.controller;

import com.procesos.tienda.model.Address;
import com.procesos.tienda.repository.AddressRepository;
import com.procesos.tienda.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("address")
    public ResponseEntity create(@Valid @RequestBody Address address, Long idUser){
        return new ResponseEntity<>(addressService.createAddress(address, idUser), HttpStatus.CREATED);
    }
    @GetMapping("address/disable/{idUser}")
    public ResponseEntity disable(@PathVariable Long id){
        return ResponseEntity.ok(addressService.updateStatusAddress(id));
    }

    @GetMapping("address")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(addressService.findAllAddress());
    }
}
