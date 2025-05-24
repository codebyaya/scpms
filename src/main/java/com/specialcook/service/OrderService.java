package com.specialcook.service;

import com.specialcook.model.Customer;
import com.specialcook.model.Ingredient;
import com.specialcook.model.MealPlan;
import com.specialcook.model.Order;
import com.specialcook.model.Inventory;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private Inventory inventory;

    public OrderService(Inventory inventory) {
        this.inventory = inventory;
    }

    // إنشاء طلب جديد للعميل مع مكونات معينة
    public Order createOrder(Customer customer, List<Ingredient> ingredients) {
        List<Ingredient> finalIngredients = new ArrayList<>();

        for (Ingredient ingredient : ingredients) {
            // التحقق من توفر المكون في المخزون
            if (!inventory.hasIngredient(ingredient.getName())) {
                Ingredient substitute = suggestSubstitute(ingredient.getName(), customer);
                if (substitute != null) {
                    finalIngredients.add(substitute);
                    notifyChefSubstitution(ingredient.getName(), substitute.getName());
                } else {
                    System.out.println("No substitute found for: " + ingredient.getName());
                }
            } else if (customer.getAllergies().contains(ingredient.getName())) {
                System.out.println("Skipping allergen: " + ingredient.getName());
            } else {
                finalIngredients.add(ingredient);
            }
        }

        MealPlan mealPlan = new MealPlan(customer.getName(), finalIngredients);
        Order order = new Order(customer, mealPlan);
        customer.addOrder(order);
        return order;
    }

    // اقتراح بديل لمكون غير متاح
    private Ingredient suggestSubstitute(String ingredientName, Customer customer) {
        List<Ingredient> available = inventory.getAllIngredients();

        for (Ingredient ingredient : available) {
            if (!ingredient.getName().equalsIgnoreCase(ingredientName) &&
                    !customer.getAllergies().contains(ingredient.getName()) &&
                    customer.getDietaryPreferences().contains(ingredient.getType())) {
                return ingredient;
            }
        }
        return null;
    }

    // إشعار الشيف بوجود استبدال
    private void notifyChefSubstitution(String original, String substitute) {
        System.out.println("Ingredient substitution: " + original + " replaced with " + substitute);
    }

    // التحقق من صحة التكوين قبل الإرسال
    public boolean validateOrder(Order order) {
        List<Ingredient> ingredients = order.getMealPlan().getIngredients();

        for (Ingredient ingredient : ingredients) {
            if (!inventory.hasIngredient(ingredient.getName())) {
                return false;
            }
        }

        return true;
    }

    public List<Order> getOrdersForCustomer(Customer customer) {
    }
}
