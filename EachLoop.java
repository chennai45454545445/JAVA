package com.company;

public class EachLoop {
    public static void main(String[] args) {
        int[] marks =new int[4];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        marks[3]=4;

        for(int element:marks){
            System.out.println(element);
        }
    }
}
