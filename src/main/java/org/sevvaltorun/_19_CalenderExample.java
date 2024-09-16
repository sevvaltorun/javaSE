package org.sevvaltorun;
import java.util.Calendar;

public class _19_CalenderExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //now:
        System.out.println("Now: " + calendar.getTime());

        //manipulation:
        calendar.add(Calendar.DAY_OF_MONTH,5);
        System.out.println("5 days after:" + calendar.getTime());

        //set the date:
        calendar.set(2015,Calendar.JANUARY,19);
        System.out.println("Set the date: " + calendar.getTime());
    }
}
