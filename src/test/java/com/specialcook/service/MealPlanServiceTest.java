package com.specialcook.service;

import com.specialcook.model.Customer;
import com.specialcook.model.MealPlan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MealPlanServiceTest {

    @Test
    public void testCreateAndGetMealPlan() {
        MealPlanService service = new MealPlanService();
        Customer customer = new Customer("Omar");

        MealPlan plan = service.createMealPlan(customer);
        assertNotNull(plan);
        assertEquals(customer, plan.getCustomer());
    }
}
