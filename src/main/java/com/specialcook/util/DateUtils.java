package com.specialcook.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static String formatDate(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }

    public static boolean isBeforeNow(LocalDateTime dateTime) {
        return dateTime.isBefore(LocalDateTime.now());
    }

    public static boolean isAfterNow(LocalDateTime dateTime) {
        return dateTime.isAfter(LocalDateTime.now());
    }
}
