package com.specialcook.model;

import java.util.*;

public class Order {
    private Customer customer;
    private List<String> ingredients;
    private Map<String, String> substitutions; // Original ingredient -> Substitute
    private double totalCost;
    private boolean valid;

    public Order(Customer customer) {
        this.customer = customer;
        this.ingredients = new ArrayList<>();
        this.substitutions = new HashMap<>();
        this.totalCost = 0.0;
        this.valid = true;
    }

    public void addIngredient(String ingredient, double price) {
        ingredients.add(ingredient);
        totalCost += price;
    }

    public void suggestSubstitution(String original, String substitute) {
        substitutions.put(original, substitute);
    }

    public void applySubstitution(String original) {
        if (substitutions.containsKey(original) && ingredients.contains(original)) {
            ingredients.remove(original);
            ingredients.add(substitutions.get(original));
        }
    }

    public boolean validateIngredients(List<String> unavailableIngredients) {
        for (String ing : ingredients) {
            if (unavailableIngredients.contains(ing)) {
                valid = false;
                return false;
            }
        }
        valid = true;
        return true;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public Map<String, String> getSubstitutions() {
        return substitutions;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public boolean isValid() {
        return valid;
    }
}