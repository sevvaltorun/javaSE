package org.sevvaltorun;

public class _12_strings {
    public static void main(String[] args) {
        int age=22;
        String name="ceyda";
        String surname="torun";
        String fullname= name + " " +  surname;
        System.out.println(fullname);

        int nameLenght= name.length();
        System.out.println("Lenght of name: " + nameLenght);

        int eHarfliIndeks= name.indexOf('e');
        System.out.println("E Harfli Indeks: "+ eHarfliIndeks);

        String altDize= surname.substring(0,2);
        System.out.println(altDize);

       // String formatliMetin= String.format("Name: %s Surname: %s Age: %d",name, surname,age);

     String buyukHarf= name.toUpperCase();
     String kucukHarf= surname.toLowerCase();
        System.out.println(name+" "+surname);
        System.out.println(buyukHarf+" "+kucukHarf);

        
    }
}
