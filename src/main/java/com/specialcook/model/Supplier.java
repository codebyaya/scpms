
package com.specialcook.model;

import java.util.HashMap;
import java.util.Map;

public class Supplier {
    private String name;
    private String contactInfo;
    private Map<String, Double> ingredientPrices; // اسم المكون -> السعر لكل وحدة

    public Supplier(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.ingredientPrices = new HashMap<>();
    }

    // إضافة أو تحديث سعر مكون
    public void setIngredientPrice(String ingredientName, double price) {
        ingredientPrices.put(ingredientName.toLowerCase(), price);
    }

    // الحصول على سعر مكون معين
    public Double getIngredientPrice(String ingredientName) {
        return ingredientPrices.get(ingredientName.toLowerCase());
    }

    // التحقق مما إذا كان المورد يوفر مكونًا معينًا
    public boolean suppliesIngredient(String ingredientName) {
        return ingredientPrices.containsKey(ingredientName.toLowerCase());
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public Map<String, Double> getAllPrices() {
        return new HashMap<>(ingredientPrices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Supplier: " + name + "\nContact: " + contactInfo + "\nIngredients:\n");
        for (Map.Entry<String, Double> entry : ingredientPrices.entrySet()) {
            sb.append("- ").append(entry.getKey()).append(": $").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}