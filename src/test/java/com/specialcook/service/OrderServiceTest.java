package com.specialcook.service;

import com.specialcook.model.Customer;
import com.specialcook.model.Order;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    public void testPlaceOrderAndRetrieve() {
        OrderService service = new OrderService();
        Customer customer = new Customer("Fatima");
        Order order = new Order(customer, "Pizza");

        service.placeOrder(order);
        List<Order> orders = service.getOrdersForCustomer(customer);
        assertEquals(1, orders.size());
        assertEquals("Pizza", orders.get(0).getMeal());
    }
}