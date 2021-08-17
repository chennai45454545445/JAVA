package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       int km;
//       double ml;
//     double b1=0.621371;
//       System.out.println("ENTER THE KILOMETERE");
//       km=sc.nextInt();
//       ml=b1*km;
//     System.out.println("IN MILES "+ml);
//        System.out.println("Enter Data");
//        System.out.println(sc.hasNextInt());
//
//    float a=7/4.0f*9/2.0f;
//        System.out.println(a);
//        char grade='a';
//        grade=(char)(grade+8);
//        System.out.println(grade);
//
//        grade=(char)(grade-8);
//        System.out.println(grade);

//        int num=19;
//        int x;
//        System.out.println("Enter Your Number");
//        x=sc.nextInt();
//        System.out.println(x>num);

        // PRACTICE SET 3

        //PROBLEM NO 1
        String str="SAHIL Ansari";
        str=str.toLowerCase();
        System.out.println(str);

        //PROBLEM No 2
        String str1="HELLO MY NAME IS SAHIL";
        str1=str1.replace(" ","_");
        System.out.println(str1);
        System.out.println(str1.replace(" ","_"));

        //PROBLEM NO 3
        String letter ="Dear <|name|> ,thanks a lot!";
        String replace;
        replace=letter.replace("<|name|>","SAHIL");
        System.out.println(replace);

        //PROBLEM NO 4
        String mystring="HELLO WELCOME TO  OUR YOUTUBE   CHANNEL";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //PROBLEM 5
        String myLetter="The Head Master\nElite Public sec School\nJaipur\nSub-Leave for two days.\n\t I Beg to say that am ill for two day so i want leave for two days\n\tThank You\n\tYour FaithFully\n\tSahil ";
        System.out.println(myLetter);
    }

}
