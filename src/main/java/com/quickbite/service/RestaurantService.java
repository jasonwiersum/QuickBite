package com.quickbite.service;

import com.quickbite.model.Restaurant;
import com.quickbite.repository.RestaurantRepository;
import com.quickbite.exception.RestaurantNotFoundException;
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

    public Restaurant createRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }
}
