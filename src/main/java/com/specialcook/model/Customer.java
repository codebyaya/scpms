package com.specialcook.model;

import java.util.*;

public class Customer {
    private String name;
    private List<String> dietaryPreferences;
    private List<String> allergies;
    private List<String> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.dietaryPreferences = new ArrayList<>();
        this.allergies = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    public void addDietaryPreference(String preference) {
        dietaryPreferences.add(preference);
    }

    public void addAllergy(String allergy) {
        allergies.add(allergy);
    }

    public void addOrderToHistory(String order) {
        orderHistory.add(order);
    }

    public List<String> getDietaryPreferences() {
        return dietaryPreferences;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<String> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Order order) {
    }

    public String getName() {

        return "";
    }
}