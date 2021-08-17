package com.company;
import java.util.Scanner;
public class MethodOverloading{
    static void sum(){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        i=sc.nextInt();
        System.out.println("THE SQUARE OF THE NUMBER IS "+" "+i*i);
    }
    static void sum(int x){
        int z=x*x*x;
        System.out.println("THE QUEBIC OF THE NUMBER IS "+" "+z);

    }
    static void sum(int x,int y){
        int z=x+y;
        System.out.println("THE SUM OF TWO NUMBER IS "+" "+z);

    }
    static void sum(int x,int y,int z){
        int k=x+y+z;
        System.out.println("THE SUM OF THREE NUMBER IS "+" "+k);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sum();
        sum(3);
        sum(6,4);
        sum(6,4,10);
    }
}
