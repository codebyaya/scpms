package com.specialcook.model;

public class Ingredient {
    private String name;
    private boolean isAvailable;
    private double pricePerUnit;
    private String unit; // مثل "kg", "g", "litre", "piece"
    private double quantityInStock;

    public Ingredient(String name, double pricePerUnit, String unit, double quantityInStock) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.unit = unit;
        this.quantityInStock = quantityInStock;
        this.isAvailable = quantityInStock > 0;
    }

    public Ingredient(String trim) {
    }

    public Ingredient(String salt, int i, String supplierB) {
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public String getUnit() {
        return unit;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setQuantityInStock(double quantity) {
        this.quantityInStock = quantity;
        this.isAvailable = quantity > 0;
    }

    public void reduceStock(double amountUsed) {
        this.quantityInStock -= amountUsed;
        if (this.quantityInStock <= 0) {
            this.quantityInStock = 0;
            this.isAvailable = false;
        }
    }

    public void restock(double amountAdded) {
        this.quantityInStock += amountAdded;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return name + " (" + quantityInStock + " " + unit + ")";
    }

    public String getType() {
        return "";
    }

    public int getQuantity() {
        return 0;
    }

    public void setQuantity(int i) {
    }

    public void setPrice(double v) {
    }

    public int getMinRequired() {
        return 0;
    }

    public String getSupplier() {
        return "";
    }
}
