package com.specialcook.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Ingredient> ingredientMap;

    public Inventory() {
        ingredientMap = new HashMap<>();
    }

    // إضافة مكون جديد أو تحديثه إن كان موجودًا
    public void addOrUpdateIngredient(Ingredient ingredient) {
        ingredientMap.put(ingredient.getName().toLowerCase(), ingredient);
    }

    // الحصول على مكون معين
    public Ingredient getIngredient(String name) {
        return ingredientMap.get(name.toLowerCase());
    }

    // تقليل الكمية عند الاستخدام
    public boolean useIngredient(String name, double amount) {
        Ingredient ingredient = getIngredient(name);
        if (ingredient != null && ingredient.getQuantityInStock() >= amount) {
            ingredient.reduceStock(amount);
            return true;
        }
        return false;
    }

    // إعادة التعبئة
    public void restockIngredient(String name, double amount) {
        Ingredient ingredient = getIngredient(name);
        if (ingredient != null) {
            ingredient.restock(amount);
        }
    }

    // عرض المكونات منخفضة المخزون
    public List<Ingredient> getLowStockIngredients(double threshold) {
        List<Ingredient> lowStock = new ArrayList<>();
        for (Ingredient ing : ingredientMap.values()) {
            if (ing.getQuantityInStock() <= threshold) {
                lowStock.add(ing);
            }
        }
        return lowStock;
    }

    // عرض جميع المكونات
    public List<Ingredient> getAllIngredients() {
        return new ArrayList<>(ingredientMap.values());
    }

    // التحقق مما إذا كان المكون متوفرًا
    public boolean isAvailable(String name, double requiredAmount) {
        Ingredient ing = getIngredient(name);
        return ing != null && ing.getQuantityInStock() >= requiredAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inventory:\n");
        for (Ingredient ing : ingredientMap.values()) {
            sb.append("- ").append(ing.toString()).append("\n");
        }
        return sb.toString();
    }

    public boolean hasIngredient(String name) {
        return false;
    }

    public boolean isLowStock(String oil) {
        return false;
    }

    public void addIngredient(Ingredient ingredient) {
    }
}
