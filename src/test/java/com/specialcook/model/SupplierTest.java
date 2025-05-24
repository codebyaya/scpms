package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SupplierTest {

    @Test
    public void testSupplierFields() {
        Supplier supplier = new Supplier("FreshFoods", "fresh@example.com");

        assertEquals("FreshFoods", supplier.getName());
        assertEquals("fresh@example.com", supplier.getContactInfo());
    }
}