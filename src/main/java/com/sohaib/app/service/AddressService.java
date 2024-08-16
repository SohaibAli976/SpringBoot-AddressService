package com.sohaib.app.service;

import com.sohaib.app.entity.Address;
import com.sohaib.app.repository.AddressRepository;
import com.sohaib.app.request.CreateAddressRequest;
import com.sohaib.app.response.AddressResponse;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    Logger logger= LoggerFactory.getLogger(AddressService.class);
    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest address) {
        Address address1= new Address() ;
        address1.setCity(address.getCity());
        address1.setStreet(address.getStreet());
        addressRepository.save(address1);
        return new AddressResponse(address1);
    }

    public AddressResponse getById(Long id) {
        logger.info("getById");
        return new AddressResponse(addressRepository.findById(id).get());
    }
}
