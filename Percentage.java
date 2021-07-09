package com.company;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float English;
        float Maths;
        float Hindi;
        float Sst;
        float Science;
        float Urdu;
        float Obtain;
        float Total=600;
        float Percentage;
        float cgpa;


        System.out.println("ENTER ENGLISH MARKS");
        English=sc.nextFloat();
        System.out.println("ENTER MATHS MARKS");
        Maths=sc.nextFloat();
        System.out.println("ENTER HINDI MARKS");
        Hindi=sc.nextFloat();
        System.out.println("ENTER Sst MARKS");
        Sst=sc.nextFloat();
        System.out.println("ENTER SCIENCE MARKS");
        Science=sc.nextFloat();
        System.out.println("ENTER URDU MARKS");
        Urdu=sc.nextFloat();
        Percentage=(Float)(English+Hindi+Maths+Sst+Science+Urdu)/Total*100;
        System.out.println("THE PERCENTAGE IS :"+Percentage);
        cgpa= (Float)(English+Hindi+Maths+Sst+Science+Urdu)/60;
        System.out.println("The cgpa is :"+cgpa);


    }
}
