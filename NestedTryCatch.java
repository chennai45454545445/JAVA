package com.company;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[3];
        marks[0]=56;
        marks[1]=100;
        marks[2]=80;
        int ind;
       boolean flag=true;
       while (flag) {
           System.out.println("Enter The Index");
           ind = sc.nextInt();
           try {
               System.out.println("Welcome To Our Proagram");
               try {
                   System.out.println("You Choose index" + ind + "value is" + marks[ind]);
                   flag=false;

               } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("Array Index Issue");
                   System.out.println(e);
               }
           } catch (Exception e) {
               System.out.println("Error Occuered");
               System.out.println(e);
           }
       }
        System.out.println("Proagram Ended");
    }
}
