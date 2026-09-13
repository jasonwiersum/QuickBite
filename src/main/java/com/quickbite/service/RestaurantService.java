package com.quickbite.service;

import com.quickbite.model.Restaurant;
import com.quickbite.repository.RestaurantRepository;
import com.quickbite.exception.RestaurantNotFoundException;
import com.quickbite.dto.UpdateRestaurantRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));
    }

    public Restaurant updateRestaurant(Long id, UpdateRestaurantRequest request) {

        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));

        restaurant.setName(request.getName());
        restaurant.setAddress(request.getAddress());
        restaurant.setCuisine(request.getCuisine());

        return restaurantRepository.save(restaurant);
    }

    public Restaurant createRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }
}
