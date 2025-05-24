package com.specialcook.util;

import com.specialcook.model.Ingredient;

import java.util.List;

public class IngredientValidator {

    private static final List<String> restrictedCombinations = List.of("Milk+Lemon", "Fish+Cheese");

    public static boolean isValidCombination(List<String> ingredients) {
        for (String combo : restrictedCombinations) {
            String[] items = combo.split("\\+");
            if (ingredients.contains(items[0]) && ingredients.contains(items[1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAvailable(String ingredient, List<String> stockList) {
        return stockList.contains(ingredient);
    }

    public static boolean isValid(Ingredient ingredient) {
        return false;
    }
}