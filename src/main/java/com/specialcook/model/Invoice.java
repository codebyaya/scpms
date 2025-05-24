package com.specialcook.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String invoiceId;
    private String customerName;
    private LocalDateTime date;
    private List<Order> orders;
    private double totalAmount;

    public Invoice(String invoiceId, String customerName) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.date = LocalDateTime.now();
        this.orders = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public Invoice(Customer customer, Order order) {
    }

    // إضافة طلب إلى الفاتورة
    public void addOrder(Order order) {
        orders.add(order);
        totalAmount += order.getTotalPrice();
    }

    // Getters
    public String getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice ID: ").append(invoiceId).append("\n");
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("Date: ").append(date).append("\n");
        sb.append("Orders:\n");
        for (Order order : orders) {
            sb.append("- ").append(order.toString()).append("\n");
        }
        sb.append("Total Amount: $").append(String.format("%.2f", totalAmount)).append("\n");
        return sb.toString();
    }

    public double getAmount() {
        return 0;
    }

    public Customer getCustomer() {
        return null;
    }
}