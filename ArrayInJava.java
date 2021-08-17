package com.company;
import java.util.Scanner;
public class ArrayInJava {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//        int[] marks=new int[4];
//        marks[0]=100;
//        marks[1]=200;
//        marks[2]=300;
//        marks[3]=400;
//        marks[4]=500;
//
//        int[] marks1;
//        marks=new int[4];

//        int[] marks2={100,200,300,400,500};
//        System.out.println(marks2[0]);
//        System.out.println(marks2[1]+marks2[4]);
int i=0;
        int[] m=new int[5];
        System.out.println("ENTER ARRAY DATA");
        for( i=0;i< m.length;i++){
           m[i]= sc.nextInt();

        }
        for( i=0;i< m.length;i++){
            System.out.println(m[i]);

        }


    }
}
