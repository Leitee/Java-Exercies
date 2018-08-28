package com.company.lab2;

public abstract class RentalItem {
    private boolean isRented = false;

    protected boolean isRented() {
        return isRented;
    }

    protected void rentItem() {
        this.isRented = true;
    }

    protected void returnItem() {
        this.isRented = false;
    }
}
