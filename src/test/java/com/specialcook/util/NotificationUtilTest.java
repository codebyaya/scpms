package com.specialcook.util;

import org.junit.jupiter.api.Test;

public class NotificationUtilTest {

    @Test
    public void testSendNotification() {
        NotificationUtil.sendNotification("User1", "Your order is ready.");
    }

    @Test
    public void testLogNotification() {
        NotificationUtil.logNotification("Stock is low.");
    }
}
