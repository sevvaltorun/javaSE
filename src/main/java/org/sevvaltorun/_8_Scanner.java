package org.sevvaltorun;

import java.util.Scanner;

public class _8_Scanner {
    public static void main(String[] args) {
        //Scanner, java'da kulanıcıdan girdi almak için kullanılan bir sınıftır.
        //java.until.Scanenr paketi içinde yer alır ve klavyeden veya diğer bir girdi kaynağından
        //veri okumak için kullanılır.
        //özellikle konsol uygulamalrında veya basit dosya okuma işlemlerinde sıkça kullanılır.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayi: "+sayi);

        //kullanım sınrasu scanner nesnesini kapatmak iyi bir uygulamadır.
         scanner.close();
         /*
         Kodun sonunda scanner.close() ifadesi kullanılarak Scanner nesnesi kaaptılır.
         Bu kaynakların serbest bırakılmasını ve programın daha etkin bir şekilde çalışmasını sağlar.
          */
    }
}
