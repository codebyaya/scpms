package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    @Test
    public void testAddAndGetIngredient() {
        Inventory inventory = new Inventory();
        Ingredient ingredient = new Ingredient("Flour", 20, "SupplierA");

        inventory.addIngredient(ingredient);
        assertEquals(ingredient, inventory.getIngredient("Flour"));
    }

    @Test
    public void testLowStock() {
        Inventory inventory = new Inventory();
        inventory.addIngredient(new Ingredient("Oil", 1, "SupplierX"));
        assertTrue(inventory.isLowStock("Oil"));
    }
}
