package com.company;
import java.util.Scanner;
public class MethodJava {
    static int sum(int x,int y){
       int z;

           z=x+y;
       return z;
    }
    // WITHOUT STATIC WE NEED CLASS OBJECT TO CALL METHOD
     int sub(int m,int n) {
        int k;
k=m-n;
        return k;
    }
static void change(int [] marks){
        marks[0]=100;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MethodJava obj=new MethodJava();
        int a=10;
        int b=6;
        int c;
            c = sum(a, b);
            System.out.println(c);
            c = obj.sub(a, b);
            System.out.println(c);
        int [] marks={10,20,30,40};
        change(marks);
        System.out.println("THE ARRAY ELEMENT IS CHANGE OR NOT LET CHECK OUT"+" "+marks[0]);



    }
}
