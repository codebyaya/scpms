package com.specialcook.service;

import com.specialcook.model.Invoice;
import com.specialcook.model.Order;
import com.specialcook.model.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BillingServiceTest {

    @Test
    public void testGenerateInvoice() {
        BillingService service = new BillingService();
        Customer customer = new Customer("Lina");
        Order order = new Order(customer, "Pasta");

        Invoice invoice = service.generateInvoice(order);
        assertNotNull(invoice);
        assertEquals(customer, invoice.getCustomer());
    }
}