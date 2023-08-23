package org.example;

public class Animal {
    private String type;

    public void getType() {
        System.out.println("this is " + type);
    }

    public void setType(String newType) {
//        if (newType.equals("dog") || newType.equals("cat")) {
//            type = newType;
//        } else {
//            System.out.println("Животное может быть только либо собака,либо кошка");
//        }
        if (!newType.equals("dog") && !newType.equals("cat")) {
            System.out.println("Животное может быть только либо собака,либо кошка");
            return;
        }
        type = newType;
    }
}
