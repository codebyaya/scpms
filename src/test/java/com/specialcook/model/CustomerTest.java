package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testAddDietaryPreference() {
        Customer customer = new Customer("Ali");
        customer.addDietaryPreference("Vegan");
        assertTrue(customer.getDietaryPreferences().contains("Vegan"));
    }

    @Test
    void testAddAllergy() {
        Customer customer = new Customer("Sara");
        customer.addAllergy("Peanuts");
        assertTrue(customer.getAllergies().contains("Peanuts"));
    }
}