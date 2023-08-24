package org.example;

public class Auto extends Transport {
    private int wheals;

    public int getWheals() {
        return wheals;
    }

    public void setWheals(int wheals) {
        this.wheals = wheals;
    }
    @Override
    public void testMethod(String input) {
        System.out.println("Этот метод перегружен в классе Auto");
        System.out.println("Этот метод с входящим параметром String = " + input);
    }
}
