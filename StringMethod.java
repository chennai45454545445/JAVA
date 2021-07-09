package com.company;
import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        String str;
//        String str1="SAHIL";
//        String s1;

//        System.out.println("ENTER YOUR STRING");
//        str= sc.nextLine();
//        value=str.length();
//        System.out.println(value);
//
//        s1=str.toLowerCase();
//        System.out.println(s1);
//
//        s1=str.toUpperCase();
//        System.out.println(s1);

//        System.out.println(str1.toLowerCase());
//
//        String trim="     HELOO    ";
//        System.out.println(trim);
//        System.out.println(trim.trim());
//
        String l ="HELLO GUYS MY NAME IS SAHIL";
        System.out.println(l.substring(11));
        System.out.println(l.substring(22,27));

        System.out.println(l.replace('S','m'));
        System.out.println(l.replace("SAHIL","MOHIT"));

        System.out.println(l.startsWith("SAH"));

        System.out.println(l.endsWith("L"));

        System.out.println(l.charAt(2));

        System.out.println(l.indexOf("YS"));

        System.out.println(l.indexOf("M", 13));
        System.out.println(l.indexOf("A",16));
       String name="sahiil";
        System.out.println(name.lastIndexOf("i"));
    System.out.println(name.lastIndexOf("i",3));

    String aru="ARRU";
        System.out.println(aru.equals("ARRU"));
        System.out.println(aru.equals("arru"));
        System.out.println(aru.equalsIgnoreCase("arru"));

        System.out.println("HELLO MY\"\t+\tWORLD\nHHHHHH");

    }
}
