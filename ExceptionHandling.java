package com.company;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int marks[]=new int[3];
        marks[0]=1;
        marks[1]=56;
        marks[2]=100;
int ind,num;
        System.out.println("Enter Array Index For divide");
        ind=sc.nextInt();
        System.out.println("Enter the number which want to divide with array");
        num=sc.nextInt();
   try {
       System.out.println("Value of index no"+ind+"is"+marks[ind]);
       System.out.println("The division is"+marks[ind]/num);
   }
   catch (ArithmeticException e){
       System.out.println("Arithmatic Error Occured!!");
       System.out.println(e);

   }
   catch (ArrayIndexOutOfBoundsException e){
       System.out.println("ArrayIndexOutOfBound!!");
       System.out.println(e);

   }
   catch (Exception e){
       System.out.println("Something Wrong Check !!");
       System.out.println(e);

   }
    }
}
