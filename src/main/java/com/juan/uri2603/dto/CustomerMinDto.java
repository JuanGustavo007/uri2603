package com.juan.uri2603.dto;

import com.juan.uri2603.entities.Customers;

public class CustomerMinDto {

    private String name;
    private String city;

    public CustomerMinDto(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public CustomerMinDto(Customers customers) {
        this.name = customers.getName();
        this.city = customers.getCity();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
