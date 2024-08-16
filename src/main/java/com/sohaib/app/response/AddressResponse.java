package com.sohaib.app.response;

import com.sohaib.app.entity.Address;

public class AddressResponse {
    private String street;

    private String city;

    private Long addressId;

    public AddressResponse(Address  address) {
        this.street = address.getStreet();
        this.city = address.getCity();
        this.addressId = address.getId();
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }


}
