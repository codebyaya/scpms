
package com.specialcook.model;

import java.util.*;

public class MealPlan {
    private String planName;
    private Customer customer;
    private List<Order> meals;
    private Date startDate;
    private Date endDate;

    public MealPlan(String planName, Customer customer, Date startDate, Date endDate) {
        this.planName = planName;
        this.customer = customer;
        this.meals = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public MealPlan(Customer customer) {
    }

    public void addMeal(String order) {
        if (order.getCustomer().equals(this.customer)) {
            meals.add(order);
        }
    }

    public void removeMeal(Order order) {
        meals.remove(order);
    }

    public double calculateTotalCost() {
        return meals.stream()
                .mapToDouble(Order::getTotalCost)
                .sum();
    }

    public String getPlanName() {
        return planName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Order> getMeals() {
        return meals;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}