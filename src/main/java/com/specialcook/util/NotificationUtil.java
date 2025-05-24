package com.specialcook.util;

public class NotificationUtil {

    public static void sendNotification(String recipient, String message) {
        System.out.println("Sending notification to " + recipient + ": " + message);
    }

    public static void logNotification(String message) {
        System.out.println("LOG: " + message);
    }
}