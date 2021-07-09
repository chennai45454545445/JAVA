package com.company;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        int a=4;
        int b=6*a;
        System.out.println(b);

        int c=6%a;  // Modulo Operator
        System.out.println(c);

        int d=10;  //Assignment operator
        d +=5;
        System.out.println(d);
        int e=20;
        e *=5;
        System.out.println(e);
        System.out.println(d>e);  //Comparison Operator

        //LOGICAL OPERATOR
        System.out.println(d>a&&e>d);

        //BITWISE OPERATOR
        System.out.println(2&3);


        //PRECEDENCE AND ASSOCIATIVITY
        int x=6*5-34/2;
        /*
         =30-34/2
         =30-7
         =13
         */
        int y=60/5-34*2;
        /*
             =12-34*2
             =12-68
             =-56
         */
        System.out.println(x);
        System.out.println(y);

        //QUIZ
        int n=40;
        int m=1;
        int k=m*n/2;
        System.out.println(k);

        int a1=20;
        int b1=40;
        int c1=5;
        int l=b1*b1-(4*a1*c1)/(2*a1);
        System.out.println(l);




    }
}
