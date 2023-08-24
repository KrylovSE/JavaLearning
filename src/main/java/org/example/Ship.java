package org.example;

public class Ship extends Transport {
    private double displacement;

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public Ship() {
    }

    public Ship(String type, String model, String maker, double displacement) {
        super(type, model, maker);
        setDisplacement(displacement);
    }
}
