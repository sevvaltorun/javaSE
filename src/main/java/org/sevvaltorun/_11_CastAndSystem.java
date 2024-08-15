package org.sevvaltorun;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Random;

public class _11_CastAndSystem {
    public static void main(String[] args) {
        //otomatik (implicit casting) dönüşüm
//        int number1= 5;
//        double number2= number1;
//        System.out.println(" implicit casting:"+number2);
//
//        //açık(explicit casting) dönüşüm
//        //yuvarlama yapılmadan verş dönüşümü gerçekleşir
//        double number3= 22.2;
//        int number4= (int) number3;
//        System.out.println("explicit casting:" + number4);
//
//        //Java'da bir sayıyı bir dizi olarak çevirmenin yolları:
//        //1)String.valueOf()
//         int number= 27;
//         String str = String.valueOf(number);
//         System.out.println(number);
//
//         //2) Integer.toString()
//        int number5= 32;
//        String str2= Integer.toString(number5);
//        System.out.println(str2);
//
//        //3)String.format() metodu:
//        int number6=77;
//        String str3= String.format("%d",number6);

        String javaVerison = System.getProperty("java.version");
        System.out.println("Java Version:" + javaVerison);

        long suanKiZaman = System.currentTimeMillis();
        System.out.println("Su anki zaman:" + suanKiZaman);

        System.out.println(Math.floor(3.9)); //aşağı yuvarlar ->3
        System.out.println(Math.ceil(3.1)); //yukarı yuvarlar ->4
        System.out.println(Math.round(4.1)); //normali
        System.out.println(Math.round(4.5)); //normali


        System.out.println(Math.pow(2, Math.max(3, 5))); //iç içe math kütüphanesi
        System.out.println(Math.pow(2, Math.min(Math.abs(-4), 12))); //iç içe math kütüphanesi

        System.out.println("Random Ornekleri:");
        System.out.println(Math.random()*3+1);
        System.out.println(Math.floor(Math.random())*3+1);

        Random random = new Random();
        int rnd= random.nextInt(3)+1;
        System.out.println(rnd);

    }
}
