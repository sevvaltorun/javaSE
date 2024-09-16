package org.sevvaltorun;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _20_TimePackage {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("NOW DATE:" + currentDate);

        LocalTime currentTime= LocalTime.now();
        System.out.println("NOW TIME:" + currentTime);

        LocalDateTime specificDateTime= LocalDateTime.of(2025,8,13,9,30,45);
        System.out.println("SPECIFIC DATE TIME: "+ specificDateTime);


    }
}
