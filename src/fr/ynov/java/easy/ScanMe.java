package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

            if (age % 2 == 0) {
                System.out.println(age + " is even");
            }   else {
                System.out.println(age + " is odd");
            }
    }
}
