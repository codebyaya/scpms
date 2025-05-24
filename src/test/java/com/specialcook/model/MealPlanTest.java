package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MealPlanTest {

    @Test
    public void testAddMealToPlan() {
        Customer customer = new Customer("Tariq");
        MealPlan plan = new MealPlan(customer);

        plan.addMeal("Salad");
        assertTrue(plan.getMeals().contains("Salad"));
    }
}
