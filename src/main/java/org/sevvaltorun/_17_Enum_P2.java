package org.sevvaltorun;
//enum is a come with java 1.5 version
public class _17_Enum_P2 {
    enum DAYS {
        Sunday(1,"pazar"), Monday(2,"pazartesi"), Tuesday(3,"salı"), Wednesday(4,"carsamba"), Thursday(5,"persembe"), Friday(6,"cuma"), Saturday(7,"cumartesi");
        private final int key;
        private final String value;
        //constructer with parameter
        //we write to code in up, then alt+insert or generate and constructor :)
       private DAYS(int key, String value) {
            this.key = key;
            this.value = value;
        }
//generate -> getter
        //setter is not come because "private"
        public int getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
       DAYS days = DAYS.Friday;
        System.out.println(days);
        System.out.println("Step: "+ days.ordinal());
        System.out.println("Key:" + days.getKey());
        System.out.println("Value:" + days.getValue());

        String data = DAYS.Monday.toString();
        System.out.println(data);
        for (DAYS temp: DAYS.values()) {
            System.out.println(temp.getKey() + "->" + temp.getValue());
        }

    }
}
