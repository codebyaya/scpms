package com.specialcook.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidationUtilTest {

    @Test
    public void testValidEmail() {
        assertTrue(ValidationUtil.isValidEmail("test@example.com"));
        assertFalse(ValidationUtil.isValidEmail("invalid-email"));
    }

    @Test
    public void testNonEmptyString() {
        assertTrue(ValidationUtil.isNonEmpty("Hello"));
        assertFalse(ValidationUtil.isNonEmpty(""));
        assertFalse(ValidationUtil.isNonEmpty("   "));
        assertFalse(ValidationUtil.isNonEmpty(null));
    }

    @Test
    public void testPositiveNumber() {
        assertTrue(ValidationUtil.isPositiveNumber(5.0));
        assertFalse(ValidationUtil.isPositiveNumber(0));
        assertFalse(ValidationUtil.isPositiveNumber(-3.2));
    }
}
