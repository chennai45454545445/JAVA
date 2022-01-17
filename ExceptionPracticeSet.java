package com.company;

import java.util.Scanner;

public class ExceptionPracticeSet {
    public static void main(String[] args) {

       //Proagram 2

        try {
            int a=888/0;
            System.out.println(a);
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");

        }
        catch (ArithmeticException e){
            System.out.println("haha");

        }

        //Progarm 3
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[4];
      marks[0]=100;
        marks[1]=200;
       marks[2]=300;
        marks[3]=400;


      boolean flag=true;
      int index;
      int i=0;
      while (flag && i<5) {
          try {
              System.out.println("Enter array index");
              index=sc.nextInt();
              System.out.println("The value of array index is"+marks[index]);
              break;

          }
          catch (Exception e){
              System.out.println("Invalid index ");
              i++;
          }

      }

        if (i>5){
            System.out.println("Error");
        }
    }
}
