package com.specialcook.util;


import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OrderValidatorTest {

    @Test
    void testValidIngredientCombination() {
        List<String> ingredients = List.of("Chicken", "Lettuce");
        assertTrue(OrderValidator.isOrderValid(ingredients));
    }

    @Test
    void testIncompatibleIngredientCombination() {
        List<String> ingredients = List.of("Tofu", "Gluten");
        assertFalse(OrderValidator.isOrderValid(ingredients));
    }
}