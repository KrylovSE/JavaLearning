package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Calc calc1 = new Calc();
        calc1.setNumber1();
        calc1.setOperation();
        calc1.setNumber2();
        System.out.println(calc1.calculate());
//        if (operation.equals("+")){
//            System.out.println(num1 + num2);
//        } else if (operation.equals("-")) {
//            System.out.println(num1 - num2);
//        } else if (operation.equals("*")) {
//            System.out.println(num1 * num2);
//        } else if (operation.equals("/")) {
//            System.out.println(num1 / num2);
//        } else {
//            System.out.println("ОШИБКА! операция можеть быть только: +, -, *, /");
//        }


//        Animal animal1 = new Animal();
//        animal1.getType();
//        animal1.setType("cat");
//        animal1.getType();
//
//        Animal animal2 = new Animal();
//        animal2.getType();
//        animal2.setType("dog");
//        animal2.getType();
//
//        animal1.setType("parrot");
//        animal1.getType();
//
//        animal1.type = "crocodile";


//         Auto myFirstAuto = new Auto();
//         myFirstAuto.setModel("pojero Sport");
//         System.out.println(myFirstAuto.getModel());
//
//         myFirstAuto.setWheals(4);
//         System.out.println(myFirstAuto.getWheals());
//
//         Ship ship1 = new Ship();
//         ship1.setDisplacement(8.5);
//         System.out.println(ship1.getDisplacement());
//
////         ship1.setWheals(4);
//
//        Truck myTruck = new Truck();
//        myTruck.setPrice(10000);
//        System.out.println(myTruck.getPrice());
//        myTruck.setWheals(12);
//        System.out.println(myTruck.getWheals());
//        myTruck.setModel("MAN");
//        System.out.println(myTruck.getModel());
//
//
//        myTruck.maker = "gost";
//        myTruck.print();

//        Transport myTransport = new Transport();
//        myTransport.testMethod();
//        myTransport.testMethod("test");
//        myTransport.testMethod(1);
//        myTransport.testMethod(3.5, "join");
//        myTransport.testMethod("join", 4.9, 10, 12, -6, 19, 503, -3);
//
//        Transport[] transportsArray = new Transport[10];
//        for (int i = 0; i < 10; i++) {
//            transportsArray[i] = new Transport();
//        }
//
//        System.out.println(transportsArray.length);
//        transportsArray[5].setMaker("join");
//        System.out.println(transportsArray[5].getMaker());
//
//        Auto auto1 = new Auto();
//        Ship ship1 = new Ship();
//        auto1.testMethod("test");
//        ship1.testMethod("test1");
//
//        Transport transport1 = new Transport("boat", "A1", "Germany");
//        System.out.println(transport1.getMaker());
//        System.out.println(transport1.getModel());
//        System.out.println(transport1.getType());
////        System.out.println(transport1.getMaker() + " " + transport1.getModel());
//
//        Transport transport2 = new Transport();
//
//        Ship ship2 = new Ship("type", "model", "maker", 8000.342);
//        System.out.println(ship2.getDisplacement());



//        System.out.println("Привет Мир!"+" Я учусь программировать");
//        System.out.println("Учимся создавать переменные");
//        int a = 1;
//        System.out.println(a);
//        int b;
//        b = 2;
//        System.out.println("b = " + b);
//        float c = 3.5F;
//        System.out.println("c = " + c);
//        double d = 4.6;
//        System.out.println( "d = " + d);
//        boolean e = true;
//        System.out.println("e = " + e);
//        String f = "моя первая строка";
//        System.out.println("f = " + f);
//
//        System.out.println("Учимся работать с Boolean");
//        boolean j = b > c;
//        System.out.println("j = " + j);
//
//        System.out.println(3 > 2);
//
//        System.out.println("Учимся работать с математическими функциями");
//        double h = Math.sqrt(9);
//        System.out.println("h = " + h);
//        double i = 1 + 4 + Math.sqrt(9);
//        System.out.println("i = " + i);
//        double g = Math.cbrt(27);
//        System.out.println("g = " + g);
//        double k = Math.pow(3, 6);
//        System.out.println("k = " + k);
//
//        double m = Math.sqrt(0.5);
//        if (m > 1) {
//            System.out.println("m = " + m);
//            System.out.println(m > 1);
//        } else {
//            System.out.println("мы внутри else");
//        }
//
//        if (m > 1 && m < 2) {
//            System.out.println("m в диапазоне от 1 до 2");
//        } else if (m > 2 && m <= 4) {
//            System.out.println("m в диапазоне от 2 до 4");
//        } else {
//            System.out.println("m вне диапазона от 1 до 4");
//        }
//
//        int l;
//        l = 0;
//        l = l + 1;
//        l += 1;
//        l++;
//        System.out.println(l);
//
//        int x = 1;
//        int n = 1;
//        for ( n = 20; n >= -20; n -= 2) {
//            System.out.println("n = " + n);
//            x = n * 2;
//            System.out.println("x = " + x);
//        }
//
//        System.out.println("posle cikla n =" + n);
//        System.out.println("posle cikla x =" + x);
//
//

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
    }
}

