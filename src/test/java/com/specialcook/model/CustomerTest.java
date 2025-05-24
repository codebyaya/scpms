package com.specialcook.model;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testAddDietaryPreferenceAndAllergy() {
        Customer customer = new Customer("Ali");
        customer.addDietaryPreference("Vegan");
        customer.addAllergy("Peanuts");

        List<String> prefs = customer.getDietaryPreferences();
        List<String> allergies = customer.getAllergies();

        assertTrue(prefs.contains("Vegan"));
        assertTrue(allergies.contains("Peanuts"));
    }

    @Test
    public void testPastOrders() {
        Customer customer = new Customer("Sara");
        Order order = new Order("Custom1", "Pasta");
        customer.addPastOrder(order);

        assertEquals(1, customer.getPastOrders().size());
        assertEquals("Custom1", customer.getPastOrders().get(0).getOrderName());
    }
}