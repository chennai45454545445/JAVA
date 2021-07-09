
package com.company;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char Choice;
        double a;
        double b;
        double result;
        for (int i=0; i<=10; i++){
        System.out.println("Enter Your choice: + , -,*,/");
        Choice = sc.next().charAt(0);

        switch (Choice){
            case '+' :
                System.out.println("Enter first number:");
                a=sc.nextDouble();
                System.out.println("Enter second number:");
                b=sc.nextDouble();
                result=(a+b);
                System.out.println("The sum is :"+result);
                break;

            case '-' :
                System.out.println("Enter first number:");
                a=sc.nextDouble();
                System.out.println("Enter second number:");
                b=sc.nextDouble();
                result=(a-b);
                System.out.println("The sum is :"+result);
                break;
            case '*' :
                System.out.println("Enter first number:");
                a=sc.nextDouble();
                System.out.println("Enter second number:");
                b=sc.nextDouble();
                result=(a*b);
                System.out.println("The sum is :"+result);
                break;
            case '/' :
                System.out.println("Enter first number:");
                a=sc.nextDouble();
                System.out.println("Enter second number:");
                b=sc.nextDouble();
                result=(a/b);
                System.out.println("The sum is :"+result);
                break;
            case '√' :
                System.out.println("Enter first number:");
                a=sc.nextDouble();
                result=(a*a);
                System.out.println("The sum is :"+result);
                break;
        }

        }




    }
}