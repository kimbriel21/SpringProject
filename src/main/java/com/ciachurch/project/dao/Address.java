package com.ciachurch.project.dao;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
    private String street;

    private String province;
    public Address(){}

    public Address(String street, String province) {
        this.street = street;
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
