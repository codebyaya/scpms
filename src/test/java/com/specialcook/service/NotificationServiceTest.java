package com.specialcook.service;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void testNotificationMessageFormat() {
        String result = NotificationService.notifyUser("Order ready!");
        assertEquals("NOTIFICATION: Order ready!", result);
    }
}