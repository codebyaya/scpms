package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testOrderCreation() {
        Customer customer = new Customer("Omar");
        Order order = new Order(customer, "Burger");

        assertEquals("Burger", order.getMeal());
        assertEquals(customer, order.getCustomer());
    }

    @Test
    public void testSetAndGetStatus() {
        Order order = new Order(new Customer("Aya"), "Pizza");
        order.setStatus("Completed");
        assertEquals("Completed", order.getStatus());
    }
}