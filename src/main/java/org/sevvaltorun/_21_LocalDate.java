package org.sevvaltorun;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _21_LocalDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("***********************");

        LocalDate localDate1 = LocalDate.of(2002, 2, 27);
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfYear());
        System.out.println(localDate1.getDayOfWeek());

        System.out.println("-----------------------------------------------");
        LocalTime localTime1 = LocalTime.of(8, 25,48);
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getHour());

        System.out.println("-----------------------------------------");
        //Pattern
//        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
//        // DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss"); - or / same
//        String date= dateTimeFormatter.format(LocalDateTime.now());
//        System.out.println(date);


    }
}
