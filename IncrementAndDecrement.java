package com.company;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a=77;
        //First of all a(77) use a and then increment
        System.out.println(a++);
        System.out.println(a++);
        // First of all a is increment and then assign in a
        System.out.println(++a);
        System.out.println(++a);
        int b=7;
        System.out.println(++b*8);
        char ch='a';
        System.out.println(++ch);

    }
}
