package org.sevvaltorun;

import java.io.StringWriter;

public class _14_stringBuilder {
    public static void main(String[] args) {
        //1.yol birleştirme
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("java ").append("jsp ").append("jsf");
//        String toChange = stringBuilder.toString();
//        System.out.println(toChange);

        //2.yol birleştirme
//        String tech1="java ", tech2=" .net core ", tech3=" c++";
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(tech1).append(tech2).append(tech3);
//        String toChange2= stringBuilder.toString();
//        System.out.println(toChange2);

        //3.yol birleştirme
        String tech1="java ", tech2=" .net core ", tech3=" c++";
        String allData=tech1+ tech2+ tech3;
        System.out.println(allData);

        //4.yol birleştirme
        String tech11="python ", tech22=" .net core ", tech33=" c++";
        String concatString=tech11.concat(tech22).concat(tech33);
        System.out.println(concatString);

        StringBuilder stringBuilder = new StringBuilder(tech11);
        stringBuilder.append(tech22).append(tech33);
        String toChange = stringBuilder.toString();
        System.out.println(toChange);

        String tech12="CSS ", tech13="HTML", tech14=" c";
        StringBuffer stringBuffer = new StringBuffer(tech12);
        stringBuffer.append(tech13).append(tech14);
        String toChange11 = stringBuffer.toString();
        System.out.println(toChange11);
    }
}
