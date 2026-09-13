package com.quickbite.controller;

import com.quickbite.dto.CreateRestaurantRequest;
import com.quickbite.model.Restaurant;
import com.quickbite.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import java.util.List;

@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/api/restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("/api/restaurants")
    public Restaurant createRestaurant(@Valid @RequestBody CreateRestaurantRequest request) {

        Restaurant restaurant = new Restaurant(
                null,
                request.getName(),
                request.getAddress(),
                request.getCuisine()
        );

        return restaurantService.createRestaurant(restaurant);
    }
}