package com.sohaib.app.controller;

import com.sohaib.app.entity.Address;
import com.sohaib.app.request.CreateAddressRequest;
import com.sohaib.app.response.AddressResponse;
import com.sohaib.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
@RefreshScope
public class AddressController {

    @Autowired
    AddressService addressService;

    @Value("${address.test}")
    private String test;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest address) {
        return addressService.createAddress(address);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getAddressById(@PathVariable("id") Long id) {
        return addressService.getById(id);
    }

    @GetMapping("/test")
    public String test() {
        return test;
    }
}
