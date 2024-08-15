package org.sevvaltorun;

import java.util.Scanner;

public class _15_conditional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        int number = scanner.nextInt();
//
//        if(number>0){
//            System.out.println("Girilen sayi pozitif");
//        }
//        else if (number==0) {
//            System.out.println("Girilen sayi 0'dır");
//        }
//        else {
//            System.out.println("Girilen sayi negatif");
//        }

        //ternary
        String result = (number > 0) ? number + " sayi pozitif" : number + " sayi negatif";
        System.out.println(result);
        scanner.close();

//        int number2= 11;
//        String result= (number2 % 2==0)? "çift":"tek";
//        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please write to fruit number: ");
//        int fruitNo = scanner.nextInt();
//
//        String fruit = switch (fruitNo) {
//            case 1 -> "apple";
//            case 2 -> "banana";
//            case 3 -> "strawberry";
//            case 4 -> "melon";
//            case 5 -> "watermelon";
//            default -> "undefined fruit number";
//        };
//
//        System.out.println("Your choose fruit: "+fruit);

    }
}
