package com.careerdevs.JSONPlaceHolderAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user")

public class UserController {
    private final String jsonPlaceholderEndpoint = "https://jsonplaceholder.typicode.com";


    @GetMapping("/")
    public String routeRoute() {
        return "Hi";

    }

    @GetMapping("/users")
    public Object usersHandler(RestTemplate restTemplate) {
        return restTemplate.getForObject(jsonPlaceholderEndpoint + "/users", Object.class);
    }

    @GetMapping("/posts")
    public Object postHandler(RestTemplate restTemplate) {
        return restTemplate.getForObject(jsonPlaceholderEndpoint + "/posts", Object.class);

    }

    @GetMapping("/photos")
    public Object photoHandler(RestTemplate restTemplate) {
        return restTemplate.getForObject(jsonPlaceholderEndpoint + "/photos", Object.class);

    }

    @GetMapping("/todos")
    public Object todosHandler(RestTemplate restTemplate) {
        return restTemplate.getForObject(jsonPlaceholderEndpoint + "/todos", Object.class);
    }

}