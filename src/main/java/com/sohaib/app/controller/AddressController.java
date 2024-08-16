package com.sohaib.app.controller;

import com.sohaib.app.entity.Address;
import com.sohaib.app.request.CreateAddressRequest;
import com.sohaib.app.response.AddressResponse;
import com.sohaib.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;


    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest address) {
        return addressService.createAddress(address);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getAddressById(@PathVariable("id") Long id) {
        return addressService.getById(id);
    }
}
