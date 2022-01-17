package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
       return ("Arithmatic Exception");
    }
    @Override
    public String getMessage(){
        return ("Array Out Of bound");
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter any Number");
        a=sc.nextInt();
        if(a<9) {
            try {
 throw new ArithmeticException("Arithmatic Exception hai");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());

            }
        }
        else {
            System.out.println("Try Again");
        }

    }
}
