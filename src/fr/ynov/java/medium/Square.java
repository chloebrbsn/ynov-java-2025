package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {

    public int number;

    public static int Nbsquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Square Number: ");
        int number = sc.nextInt();

        System.out.print(Nbsquare(number));
    }

}
