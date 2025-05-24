package com.specialcook.service;

import java.util.HashMap;
import java.util.Map;

public class NotificationService {

    private final Map<String, String> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    /**
     * إرسال إشعار لمستخدم محدد.
     *
     * @param recipient اسم المستلم (عميل، طاهٍ، مدير المطبخ، إلخ)
     * @param message   محتوى الإشعار
     */
    public void sendNotification(String recipient, String message) {
        // يمكن استبداله بإرسال بريد إلكتروني أو تنبيه في التطبيق
        notifications.put(recipient, message);
        System.out.println("🔔 Notification sent to " + recipient + ": " + message);
    }

    /**
     * استرجاع آخر إشعار لمستخدم معين.
     *
     * @param recipient اسم المستلم
     * @return نص الإشعار أو null إذا لم يوجد
     */
    public String getLastNotification(String recipient) {
        return notifications.get(recipient);
    }

    /**
     * إرسال تنبيه حول انخفاض المخزون.
     *
     * @param ingredientName اسم المكون منخفض المخزون
     */
    public void notifyLowStock(String ingredientName) {
        sendNotification("Kitchen Manager", "⚠️ Low stock alert: " + ingredientName);
    }

    /**
     * إرسال تذكير لطلب مجدول.
     *
     * @param chefName اسم الطاهي
     * @param task     اسم المهمة أو الطلب
     */
    public void notifyChefTask(String chefName, String task) {
        sendNotification(chefName, "🧑‍🍳 Reminder: You have a task - " + task);
    }

    /**
     * إرسال تذكير للعميل بطلب قادم.
     *
     * @param customerName اسم العميل
     * @param orderInfo    تفاصيل الطلب
     */
    public void notifyCustomerUpcomingOrder(String customerName, String orderInfo) {
        sendNotification(customerName, "📦 Upcoming delivery: " + orderInfo);
    }

    public void notifyChef(String prepareVeganPasta) {
    }
}