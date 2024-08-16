package org.sevvaltorun;

public class _17_Enum {
    enum DAYS {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        DAYS days = DAYS.Monday;
        System.out.println("Class Name:" + days.getClass());
        System.out.println(days instanceof DAYS);
        String data = DAYS.Monday.toString();
        System.out.println(data);
        System.out.println(data.toUpperCase());

        System.out.println("Step:"+ DAYS.Sunday.ordinal());
        System.out.println("Step:"+ DAYS.Friday.ordinal());

    //    System.out.println("Value:"+ DAYS.Sunday.values()[0]);
    }
}