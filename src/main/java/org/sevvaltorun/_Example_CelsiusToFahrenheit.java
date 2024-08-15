package org.sevvaltorun;
import java.util.Scanner;
public class _Example_CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter to degree please:");
        int degree= scanner.nextInt();

        int fahrenheit= degree*9/5+32;

        System.out.println(degree + " Degree to: "+fahrenheit +" F");
    }
}
