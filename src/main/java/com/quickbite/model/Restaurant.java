package com.quickbite.model;

public class Restaurant {

    private Long id;
    private String name;
    private String address;
    private String cuisine;

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

}
