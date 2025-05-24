package com.specialcook.util;

import com.specialcook.model.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientValidatorTest {

    @Test
    public void testValidIngredient() {
        Ingredient ingredient = new Ingredient("Tomato", 1.5, "FreshFarm");
        assertTrue(IngredientValidator.isValid(ingredient));
    }

    @Test
    public void testInvalidName() {
        Ingredient ingredient = new Ingredient("", 1.5, "FreshFarm");
        assertFalse(IngredientValidator.isValid(ingredient));
    }

    @Test
    public void testInvalidPrice() {
        Ingredient ingredient = new Ingredient("Tomato", -2.0, "FreshFarm");
        assertFalse(IngredientValidator.isValid(ingredient));
    }

    @Test
    public void testNullIngredient() {
        assertFalse(IngredientValidator.isValid(null));
    }

    @Test
    public void testInvalidSupplier() {
        Ingredient ingredient = new Ingredient("Tomato", 1.5, "");
        assertFalse(IngredientValidator.isValid(ingredient));
    }
}
