package com.company;
import java.util.Scanner;
public class StringInJava {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      String str="SAHIL";
        System.out.println(str);
        String str1= new String("SAHIL IS A GOOD BOY");
        System.out.println(str1);
        System.out.println(str1+str);
        System.out.println("HELLO MY NAME IS "+str);
        System.out.println("ENTER YOUR NAME");
        String str2= sc.nextLine();
        System.out.println(str2);
        int a=19; float b=4.05f;
        String str3="ARRU";
        System.out.printf("THE VALUR of a is %d value of b %9.9f and value of str3 is %s ",a,b,str3);
      System.out.format("THE VALE OF a is %d",a);

    }
}
