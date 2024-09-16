package org.sevvaltorun;

public class _17_Enum {
    enum DAYS {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        DAYS days = DAYS.Monday;
        System.out.println("Class Name:" + days.getClass());
       //always true:
        //System.out.println(days instanceof DAYS);

        //enum toString:
        String data = DAYS.Monday.toString();
        System.out.println(data);
        System.out.println(data.toUpperCase());

        //we'll find to ordinal:
        System.out.println("Step:"+ DAYS.Sunday.ordinal());
        System.out.println("Step:"+ DAYS.Friday.ordinal());

        System.out.println("Value:" + DAYS.values()[0]);
        System.out.println("Value:" + DAYS.values()[3]);
        //old version code at down, new version in up code
       //    System.out.println("Value:"+ DAYS.Sunday.values()[0]);

 for(DAYS temp :DAYS.values()){
     System.out.println(temp + " ");
 }


    }
}