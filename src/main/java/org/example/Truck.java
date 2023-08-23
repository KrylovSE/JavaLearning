package org.example;

public class Truck extends Auto {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("type = " + getType() + " model = " + getModel() + " maker = " + getMaker() + " Wheals = " + getWheals() + " price = " + getPrice());
    }
}
