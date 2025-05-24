
package com.specialcook.service;

import com.specialcook.model.Ingredient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {

    @Test
    public void testAddAndGetIngredient() {
        InventoryService service = new InventoryService();
        Ingredient ingredient = new Ingredient("Tomato", 10, "SupplierA");

        service.addIngredient(ingredient);
        assertEquals(ingredient, service.getIngredient("Tomato"));
    }

    @Test
    public void testIsLowStock() {
        InventoryService service = new InventoryService();
        Ingredient ingredient = new Ingredient("Salt", 1, "SupplierB");

        service.addIngredient(ingredient);
        assertTrue(service.isLowStock("Salt"));
    }
}