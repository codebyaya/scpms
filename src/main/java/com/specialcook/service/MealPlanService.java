package com.specialcook.service;

import com.specialcook.model.Customer;
import com.specialcook.model.Ingredient;
import com.specialcook.model.MealPlan;

import java.util.ArrayList;
import java.util.List;

public class MealPlanService {

    /**
     * ينشئ خطة وجبة مخصصة بناءً على تفضيلات وحساسيات العميل.
     *
     * @param customer     العميل
     * @param ingredients  قائمة المكونات المقترحة
     * @return             كائن MealPlan جاهز
     */
    public MealPlan createPersonalizedMealPlan(Customer customer, List<Ingredient> ingredients) {
        List<Ingredient> filtered = new ArrayList<>();

        for (Ingredient ingredient : ingredients) {
            if (customer.getAllergies().contains(ingredient.getName())) {
                System.out.println("Ingredient removed due to allergy: " + ingredient.getName());
                continue;
            }
            if (!customer.getDietaryPreferences().contains(ingredient.getType())) {
                System.out.println("Ingredient removed due to dietary preference: " + ingredient.getName());
                continue;
            }
            filtered.add(ingredient);
        }

        return new MealPlan(customer.getName(), filtered);
    }

    /**
     * يقترح مكونات بناءً على تفضيلات العميل.
     *
     * @param customer         العميل
     * @param availableItems   جميع المكونات المتاحة
     * @return                 قائمة مكونات مخصصة
     */
    public List<Ingredient> suggestIngredients(Customer customer, List<Ingredient> availableItems) {
        List<Ingredient> suggestions = new ArrayList<>();

        for (Ingredient ingredient : availableItems) {
            if (customer.getDietaryPreferences().contains(ingredient.getType())
                    && !customer.getAllergies().contains(ingredient.getName())) {
                suggestions.add(ingredient);
            }
        }

        return suggestions;
    }

    public MealPlan createMealPlan(Customer customer) {
        return null;
    }
}
