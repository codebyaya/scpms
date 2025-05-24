package com.specialcook.util;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DateUtilTest {

    @Test
    public void testGetCurrentTimestamp() {
        Object DateUtil = null;
        String timestamp = DateUtil.getCurrentTimestamp();
        assertNotNull(timestamp);
        assertTrue(timestamp.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
    }

    @Test
    public void testFormatDateTime() {
        LocalDateTime now = LocalDateTime.of(2024, 5, 24, 14, 30, 0);
        String DateUtil = null;
        String formatted = String.format(String.valueOf(now));
        assertEquals("2024-05-24 14:30:00", formatted);
    }
}