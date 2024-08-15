package org.sevvaltorun;
import java.util.Scanner;
public class _Example_FindToHypotenuse
{
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to first edge:");
        int edge1= scanner.nextInt();

        System.out.println("Enter to second edge:");
        int edge2= scanner.nextInt();

        double hypotenuse= Math.pow(edge1,2)+Math.pow(edge2,2);
        double result= Math.sqrt(hypotenuse);

        System.out.println(result);
    }
}
