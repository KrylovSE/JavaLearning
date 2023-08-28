package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    private Double number1;
    private Double number2;
    private String operation;

    public Calc() {
    }


    public Double getNumber1() {
        return number1;
    }

    public void setNumber1() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            this.number1 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("ОШИБКА! Вы должны ввести любое число");
        }
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите второе число: ");
            this.number2 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("ОШИБКА! Вы должны ввести любое число");
        }
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите операцию: ");
            this.operation = input.next();
        } catch (Exception e) {
            System.out.println("ОШИБКА! Операция может быть +, -, *, /");
        }
    }

    public Double calculate() {
        return calculate(getNumber1(), getNumber2(), getOperation());
    }

    private Double calculate(Double number1, Double number2, String operation) {
        Double result;
        if (operation.equals("+")){
            result = number1 + number2;
        } else if (operation.equals("-")) {
            result = number1 - number2;
        } else if (operation.equals("*")) {
            result = number1 * number2;
        } else if (operation.equals("/")) {
            result = number1 / number2;
        } else {
            System.out.println("ОШИБКА! операция можеть быть только: +, -, *, /");
            return 0.0;
        }
        return result;
    }


}
