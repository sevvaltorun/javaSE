package org.sevvaltorun;

public class _7_NumberSystem {
    public static void main(String[] args) {
        int decimalNumber = 23;

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Ikili Tabandaki Karşılığı: " + binaryNumber);

        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Sekizli Tabandaki Karşılığı: " + octalNumber);

        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("On Altılı Tabandaki Karşılığı: " + hexadecimalNumber);


    }
}
