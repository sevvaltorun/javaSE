package org.sevvaltorun;

public class _111_mix {
    public static void main(String[] args) {
        String vocabulary = "ceyda ile JAVA Dersleri ceyda ";
        System.out.println(vocabulary);

        System.out.println("Harf Sayısı:" + vocabulary.length());
        System.out.println("Traşlanmış Harf Sayısı: (boşluklar yok) " + vocabulary.trim().length());
        System.out.println("Büyük Harfler: " + vocabulary.toUpperCase());
        System.out.println("Küçük Harfler: " + vocabulary.toLowerCase());
        System.out.println("Sağdan Arama:" + vocabulary.indexOf("ceyda"));
        System.out.println("Soldan Arama:" + vocabulary.lastIndexOf("ceyda"));

        System.out.println(vocabulary.concat("sevvaltorun")); // sonuna ekleme köklü değiştirme yapmaz
        System.out.println(vocabulary);

        vocabulary = vocabulary.concat("svvl "); //köklü değişiklik yapar
        System.out.println(vocabulary);

        System.out.println(vocabulary.charAt(1)); // 1.karakterdekini göster
        System.out.println(vocabulary.substring(9)); //1.indeksten başlayarak göster
        System.out.println(vocabulary.substring(1,10));

        String fruits= "apple banana melon";
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.contains("strawberry"));
        System.out.println(vocabulary.startsWith("ceyda")); //boşluk var mı yok mu dikkat et
        System.out.println(vocabulary.endsWith("svvl")); // boşluk iile bitiyo

        System.out.println(vocabulary.replace(vocabulary,"change it"));
        //replace değişiklik yapmamızı sağladı, vocabulary'deki cümleleri change it ile değiştirerek yazdı.
        //kalıcı değil!!
        //manipülasyon==değişiklik
        System.out.println(vocabulary);

        String[] allData=vocabulary.split(" ");
        //boşluğa göre parçalayacak ve onları dizi elemanı yapacak





    }
}
