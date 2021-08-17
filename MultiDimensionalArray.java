package com.company;
import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] marks=new int[3][3];
//        marks[0][0]=1;
//        marks[0][1]=2;
//        marks[0][2]=3;
//        marks[1][0]=4;
//        marks[1][1]=5;
//        marks[1][2]=6;
//        marks[2][0]=7;
//        marks[2][1]=8;
//        marks[2][2]=9;



        for (int i=0;i< marks.length;i++){
            for (int j=0;j<marks.length;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }
}
