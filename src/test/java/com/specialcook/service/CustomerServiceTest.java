package com.specialcook.service;

import com.specialcook.model.Customer;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerServiceTest {

    @Test
    public void testAddCustomerAndGetByName() {
        CustomerService service = new CustomerService();
        Customer customer = new Customer("Ali");
        service.addCustomer(customer);

        Customer result = service.getCustomerByName("Ali");
        assertNotNull(result);
        assertEquals("Ali", result.getName());
    }

    @Test
    public void testGetAllCustomers() {
        CustomerService service = new CustomerService();
        service.addCustomer(new Customer("Sara"));
        service.addCustomer(new Customer("Ahmed"));

        List<Customer> allCustomers = (List<Customer>) service.getAllCustomers();
        assertEquals(2, allCustomers.size());
    }
}
