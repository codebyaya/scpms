package com.specialcook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    @Test
    public void testIngredientFields() {
        Ingredient ing = new Ingredient("Tomato", 5, "FreshFarms");

        assertEquals("Tomato", ing.getName());
        assertEquals(5, ing.getQuantity());
        assertEquals("FreshFarms", ing.getSupplier());
    }

    @Test
    public void testSetQuantity() {
        Ingredient ing = new Ingredient("Salt", 2, "LocalSupplier");
        ing.setQuantity(10);
        assertEquals(10, ing.getQuantity());
    }
}