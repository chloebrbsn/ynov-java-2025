package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int nb1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int nb2 = sc.nextInt();

        System.out.print("Choose an operator (+, -, *, /): ");
        String operator = sc.next();

        int result = 0;
        boolean valid = true;

        if (operator.equals("+")) {
            result = nb1 + nb2;
        } else if (operator.equals("-")) {
            result = nb1 - nb2;
        } else if (operator.equals("*")) {
            result = nb1 * nb2;
        } else if (operator.equals("/")) {
            if (nb2 != 0) {
                result = nb1 / nb2;
            } else {
                System.out.println("Error: Division by zero!");
                valid = false;
            }
        } else {
            System.out.println("Invalid operator!");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}