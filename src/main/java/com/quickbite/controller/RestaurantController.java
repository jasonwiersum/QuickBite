package com.quickbite.controller;

import com.quickbite.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/api/restaurants")
    public List<Restaurant> getRestaurants() {

        Restaurant bratwursthaeusle = new Restaurant(
                1L,
                "Bratwursthäusle",
                "Nürnberg",
                "Traditional Franconian"
        );

        Restaurant kokoro = new Restaurant(
                3L,
                "Kokoro Craft Ramen",
                "Nürnberg",
                "Japanese"
        );

        Restaurant esszimmer = new Restaurant(
                4L,
                "Restaurant EssZimmer",
                "Nürnberg",
                "Fine Dining"
        );

        Restaurant padelle = new Restaurant(
                5L,
                "Padelle d'Italia",
                "Nürnberg",
                "Italian"
        );

        Restaurant sangam = new Restaurant(
                6L,
                "Sangam",
                "Nürnberg",
                "Indian"
        );

        Restaurant codung = new Restaurant(
                7L,
                "CoDung Asian Lounge",
                "Nürnberg",
                "Vietnamese"
        );

        Restaurant sushiWorld = new Restaurant(
                8L,
                "Sushi World & Wok",
                "Fürth",
                "Japanese"
        );

        Restaurant fiveGuys = new Restaurant(
                9L,
                "Five Guys",
                "Nürnberg",
                "Fast Food"
        );

        Restaurant friedChicken = new Restaurant(
                10L,
                "KFC Nürnberg Central",
                "Nürnberg",
                "Fast Food"
        );

        return List.of(
                bratwursthaeusle,
                kokoro,
                esszimmer,
                padelle,
                sangam,
                codung,
                sushiWorld,
                fiveGuys,
                friedChicken
        );
    }
}
