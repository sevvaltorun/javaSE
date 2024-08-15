package org.sevvaltorun;
import java.util.Scanner;
public class _Example_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter to first number:");
        int first= scanner.nextInt();

        System.out.println("Please enter to second number:");
        int second= scanner.nextInt();

        System.out.println("choose option 1 for add");
        System.out.println("choose option 2 for subtraction");
        System.out.println("choose option 3 for divison");
        System.out.println("choose option 4 for multiplication");

        System.out.println("CHOOSE ONE OPTİON:");
        int option=scanner.nextInt();

        if(option ==1 ){
            System.out.println(first+second);
        } else if (option == 2) {
            System.out.println(first-second);
        }
        else if (option == 3) {
            System.out.println(first/second);
        }
        else if (option == 4){
            System.out.println(first*second);
        }
        else{
            System.out.println("undefined process");
        }
    }
}
