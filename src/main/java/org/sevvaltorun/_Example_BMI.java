package org.sevvaltorun;

import java.util.Scanner;

public class _Example_BMI {
    public static void main(String[] args) {
        //formul= vki=kilo/boy*boy
        //kullanıcıdan aldık double kullsan
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter to weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Please enter to height (cm): ");
        double height = scanner.nextDouble();

        double result = weight/(height*height);
        System.out.println("Your BMI:" + result);
    }
}
