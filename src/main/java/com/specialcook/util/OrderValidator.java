package com.specialcook.util;


import java.util.List;
import java.util.Set;

public class OrderValidator {
    private static final Set<String> incompatibleIngredients = Set.of("Tofu", "Gluten");

    public static boolean isOrderValid(List<String> selectedIngredients) {
        return !(selectedIngredients.contains("Tofu") && selectedIngredients.contains("Gluten"));
    }
}