package org.example;

public class Transport {
    private String type;
    private String model;
    protected String maker;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void testMethod() {
        System.out.println("Этот метод без входящих параметров");
    }

    public void testMethod(String input) {
        System.out.println("Этот метод с входящим параметром String = " + input);
    }
    public void testMethod(Integer input1) {
        System.out.println("Этот метод с входящим параметром Integer = " + input1);
    }
    public void testMethod(Double d1, String str1) {
        System.out.println("Этот метод с 2 входящими параметрами d1 = " + d1 + " str1 = " + str1);
    }
    public void testMethod(String str1, Double d1, Integer ... int1) {
        System.out.println("Этот метод с множеством параметров");
        System.out.println("Первый параметр String = " + str1);
        System.out.println("Второй параметр Double = " + d1);
        System.out.println("Третий параметр - это массив Integer");
        for (int i = 0; i < int1.length; i++) {
            System.out.println("Элемент массива i = " + i + " Значение = " + int1[i]);
        }
    }

    public Transport() {
    }

    public Transport(String type, String model, String maker) {
        setType(type);
        setModel(model);
        setMaker(maker);
    }
}

