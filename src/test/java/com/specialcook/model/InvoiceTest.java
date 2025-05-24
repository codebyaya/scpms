package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {

    @Test
    public void testInvoiceCreation() {
        Customer customer = new Customer("Nada");
        Order order = new Order(customer, "Soup");

        Invoice invoice = new Invoice(customer, order);
        assertEquals(customer, invoice.getCustomer());
        assertEquals(order, invoice.getOrder());
    }
}
