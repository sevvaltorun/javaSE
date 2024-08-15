package org.sevvaltorun;

import java.util.Scanner;

public class _Example_UnknownEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter to number for X: ");
        int x = scanner.nextInt();

        System.out.println("Please enter to number for Y: ");
        int y = scanner.nextInt();

        int number= 4*x +5*y;
        System.out.println(number);

    }
}
