package com.quickbite.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String cuisine;

    public Restaurant() {
    }

    public Restaurant(Long id, String name, String address, String cuisine) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cuisine = cuisine;
    }

    public Long getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCuisine() {
        return cuisine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
