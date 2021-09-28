package com.company;
import java.util.Scanner;
public class Recursion {
    static int factorial(int a){
//        factorial(n)=1*2.......*n
        int factorial=1;
        for (int i=1;i<=a;i++){
            if(a==0||a==1) {
                return 1;
            }
            factorial = factorial * i;

        }
        return factorial;

    }
    static int factorials(int x){
//  factorial(n)=n*(n-1)*(n-2)*....*1
       int factorial=1;
       for (int i=x;i>=1;i--){
           if(x==0||x==1) {
             return 1;
           }
           factorial = factorial * i;

       }
       return factorial;

    }
    static int factorialrecursive(int y) {
//  factorial(n)=n*(n-1)*(n-2)*....*1
        int factorial = 1;

        if (y == 0 || y == 1) {
            return 1;
        } else {
            return y * factorialrecursive(y - 1);
        }

    }
    static int fabonachi(int n){
        int [] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        System.out.printf("THE FABBONACHI SERIES TILL TO %d NO IS\n",n);
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]);
        for (int i=0;i<= n-3;i++){
            arr[i+2]=arr[i]+arr[i+1];
            System.out.print(" "+arr[i+2]);
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("FACTORIAL IS"+" "+factorial(5));
        System.out.println("FACTORIAL IS"+" "+factorials(5));
        System.out.println("FACTORIAL IS "+factorialrecursive(5));
        System.out.println(fabonachi(15));


    }
}
