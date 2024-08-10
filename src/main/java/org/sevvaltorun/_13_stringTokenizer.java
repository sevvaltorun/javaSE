package org.sevvaltorun;

import java.util.StringTokenizer;

public class _13_stringTokenizer {
    /*
    Örnekte, StringTokenizer sınıfı ile, karakteri(ayracı) kullanarak bir metin parçalara ayrılır.
    Ardından, hasMoreTokens() metodu ile bir sonraki parçanın olup olmadığı kontrol edilir ve nextToken() ile bir sonraki parça alınır.
     */
    public static void main(String[] args) {
        String metin = " Java, Python, C++, JS";
        StringTokenizer tokenizer = new StringTokenizer(metin, ",");

        while (tokenizer.hasMoreTokens()) {
            String langauge = tokenizer.nextToken();
            System.out.println("Programming Lang:" + langauge);
        }
    }
}
