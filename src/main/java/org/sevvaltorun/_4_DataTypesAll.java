package org.sevvaltorun;

public class _4_DataTypesAll {
    public static void main(String[] args) {
        //PRIMITIVE
        //Tam sayılar
        //8 bit = 1 byte
        byte   b1= 127; // -128 ile 127 arasında (8 bit)
        short s1=32767; //-32.768 ile 32.767 arasında (16 bit)
        int i1=2147483647; //-2.147.483.648 ile 2.147.483.647 arasında (32 bit)
        long l1=9223372036857L; //-9.223.372.036.858 ile -9.223.372.036.857 arasında (64 bit)

        //Virgüllü Sayılar
        float f1= 14.53f; //(32 bit)
        double  d1= 14.53; //

        //boolean
        boolean b3= false;
        boolean b3Data= 3>1;

        //char
        char  c5='T';

//        System.out.println(c5);
//        System.out.println(i1);
//        System.out.println(b3);
//        System.out.println(b3Data);

        // int data = null; YAPAMAYIZ :)

        //WRAPPER
        //Tam sayılar
        //8 bit = 1 byte
        Byte b11= 127;

        byte bytePrimitive=1;
        Byte b12= new Byte(bytePrimitive);
        System.out.println(b12);
        Short s11=32767;
        Integer i11= 2147483647;
        Integer i12= new Integer(41);
        Long l11=32768L;

        //Virgüllü Sayılar
        Float f11= 14.53f;
        Double d11 = 14.53;
        Double d2Data= new Double(14.53);
        System.out.println(d2Data);

        //boolean
        Boolean b13= false;
        Boolean b23Data= 3>1;

        //char
        Character c11='S';
        System.out.println(c11);

        Integer data11= null; //WRAPPER DA NULL OLUR

        //boxing: primitive bir türü wrapper türüne çevirmek
        int primitiveNumber=22;
        Integer wrapperNumber=primitiveNumber;
        System.out.println(wrapperNumber);
        System.out.println(primitiveNumber);
    }
 }