package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!"+" Я учусь программировать");
        System.out.println("Учимся создавать переменные");
        int a = 1;
        System.out.println(a);
        int b;
        b = 2;
        System.out.println("b = " + b);
        float c = 3.5F;
        System.out.println("c = " + c);
        double d = 4.6;
        System.out.println( "d = " + d);
        boolean e = true;
        System.out.println("e = " + e);
        String f = "моя первая строка";
        System.out.println("f = " + f);

        System.out.println("Учимся работать с Boolean");
        boolean j = b > c;
        System.out.println("j = " + j);

        System.out.println(3 > 2);

        System.out.println("Учимся работать с математическими функциями");
        double h = Math.sqrt(9);
        System.out.println("h = " + h);
        double i = 1 + 4 + Math.sqrt(9);
        System.out.println("i = " + i);
        double g = Math.cbrt(27);
        System.out.println("g = " + g);
        double k = Math.pow(3, 6);
        System.out.println("k = " + k);
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
    }
}

