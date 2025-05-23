package com.specialcook.model;


import java.util.List;

public class Customer {
    private String name;
    private List<String> dietaryPreferences;

    public Customer(String name, List<String> dietaryPreferences) {
        this.name = name;
        this.dietaryPreferences = dietaryPreferences;
    }

    public List<String> getDietaryPreferences() {
        return dietaryPreferences;
    }

    public String getName() {
        return name;
    }
}
