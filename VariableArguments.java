package com.company;

public class VariableArguments {
    static int sum(int ...arr){
        int result=0;
        for (int element: arr){
            result=result+element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("THE SUM OF TWO NUMBER IS "+sum(3,5));
        System.out.println("THE SUM OF THREE NUMBER IS "+sum(3,5,7));


    }
}
