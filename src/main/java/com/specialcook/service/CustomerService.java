package com.specialcook.service;

import com.specialcook.model.Customer;
import com.specialcook.model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private Map<String, Customer> customers;

    public CustomerService() {
        this.customers = new HashMap<>();
    }

    // إضافة عميل جديد
    public void addCustomer(Customer customer) {
        customers.put(customer.getName(), customer);
    }

    // استرجاع عميل حسب الاسم
    public Customer getCustomerByName(String name) {
        return customers.get(name);
    }

    // إضافة تفضيل غذائي لعميل معين
    public void addDietaryPreference(String customerName, String preference) {
        Customer customer = customers.get(customerName);
        if (customer != null) {
            customer.addDietaryPreference(preference);
        }
    }

    // إضافة حساسية غذائية لعميل معين
    public void addAllergy(String customerName, String allergy) {
        Customer customer = customers.get(customerName);
        if (customer != null) {
            customer.addAllergy(allergy);
        }
    }

    // إضافة طلب إلى سجل العميل
    public void addOrderToCustomer(String customerName, Order order) {
        Customer customer = customers.get(customerName);
        if (customer != null) {
            customer.addOrder(order);
        }
    }

    // استرجاع سجل الطلبات لعميل معين
    public List<String> getCustomerOrderHistory(String customerName) {
        Customer customer = customers.get(customerName);
        return customer != null ? customer.getOrderHistory() : null;
    }

    // استرجاع جميع العملاء
    public Map<String, Customer> getAllCustomers() {
        return customers;
    }
}