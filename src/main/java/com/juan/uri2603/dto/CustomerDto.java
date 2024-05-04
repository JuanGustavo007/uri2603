package com.juan.uri2603.dto;

import com.juan.uri2603.entities.Customers;

public class CustomerDto {

    private Long id;
    private String name;
    private String street;
    private String city;
    private String state;
    private Double credit;

    public CustomerDto(Long id, String name, String street, String city, String state, Double credit) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.credit = credit;
    }

    public CustomerDto(Customers customers) {
        this.id = customers.getId();
        this.name = customers.getName();
        this.street = customers.getStreet();
        this.city = customers.getCity();
        this.state = customers.getState();
        this.credit = customers.getCredit();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }
}
