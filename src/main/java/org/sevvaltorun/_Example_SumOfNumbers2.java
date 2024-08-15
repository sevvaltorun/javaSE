package org.sevvaltorun;

public class _Example_SumOfNumbers2 {
    public static void main(String[] args) {
        int sum = 0, oddNumber=0,evenNumber=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
            sum = sum + i;
            if(i % 2==0){
                evenNumber+=i;
            }
            else{
                oddNumber+=i;
            }
        }
        System.out.println("sum of numbers from 1-10: "+ sum);
        System.out.println("sum of odd numbers from 1-10: "+ oddNumber);
        System.out.println("sum of even numbers from 1-10: "+ evenNumber);
    }
}
