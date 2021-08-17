package com.company;
import java.util.Scanner;
import java.util.Random;
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        // PROBLEM NO 1: ADD 5 FLOAT ARRAY
//        float [] f=new float[4];
//        f[0 ]= 1.0f;
//        f[1 ]= 1.0f;
//        f[2 ]= 1.0f;
//        f[3 ]= 1.0f;
//        float sum=0f;
//for (float sahil:f){
//    sum=sum+sahil;
//}
//        System.out.println(sum);
//        System.out.println("SUM OF ARRAY IS "+(f[0 ]+ f[1 ]+ f[2 ]+f[3 ]));

        // PROBLEM 2 : GIVEN NUMBER IS PRESENT IN ARRAY OR NOT
//        int system;
//        int i=0;
//        int[] num=new int[50];
//        System.out.println("ENTER THE NUMBERS");
//        for ( i=0;i< num.length-1;i++){
//            num[i]=sc.nextInt();
//
//        }
//        System.out.println("THE NUMBER IS ENTERED BY USERS");
//        for( i=0;i<num.length-1;i++){
//            System.out.print(num[i]);
//            System.out.print(" ");
//        }
//        System.out.println("\n");
//for (int j=0; j<50;j++) {
//    system = r.nextInt(50);
//    System.out.println("SYSTEM SEARCHING " + system);
//    for ( i=0;i< num.length-1;i++) {
//        if (num[i] == system) {
//            System.out.println("DATA IS MATCH");
//
//
//        }
//}
//}
        // PROBLEM 3 : ADD TWO MATRIX

//        int [][] array1=new int[3][3];
//        int [][] array2=new int[3][3];
//        int [][] array3=new int [3][3];
//        System.out.println("ENTER THE ELEMNET OF ARRAY 1::");
//        for (int i=0;i< array1.length;i++) {
//            for (int j = 0; j < array1.length ; j++) {
//                array1[i][j]= sc.nextInt();
//            }
//        }
//
//        System.out.println("ENTER THE ELEMNET OF ARRAY 2::");
//        for (int i=0;i< array2.length;i++) {
//            for (int j = 0; j < array2.length ; j++) {
//                array2[i][j]= sc.nextInt();
//            }
//        }
//
//        System.out.println("ARRAY DISPLAY");
//        for (int i=0;i< array1.length;i++) {
//            for (int j = 0; j < array1.length ; j++) {
//                System.out.print(array1[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.print("\n");
//        }
//        System.out.println("\n\n");
//
//        for (int i=0;i< array2.length;i++) {
//            for (int j = 0; j < array2.length; j++) {
//                System.out.print(array2[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.print("\n");
//        }
//        System.out.println("THE ADDITION OF THIS TWO MATRIX:::");
//
//        for (int i=0;i< array1.length;i++) {
//            for (int j = 0; j < array2.length; j++) {
//                System.out.print(array3[i][j]=array1[i][j]+array2[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.print("\n");



//        }
        //PROBLEM 4 : REVERSE A MATRIX
//        int [][] array1=new int[3][3];
//        int [][] array2=new int[3][3];
//
//        System.out.println("ENTER THE ELEMNET OF ARRAY 1::");
//        for (int i=0;i< array1.length;i++) {
//            for (int j = 0; j < array1.length ; j++) {
//                array1[i][j]= sc.nextInt();
//            }
//        }
//
//        System.out.println("ENTER THE ELEMNET OF ARRAY 2::");
//        for (int i=0;i< array2.length;i++) {
//            for (int j = 0; j < array2.length ; j++) {
//                array2[i][j]= sc.nextInt();
//            }
//        }
//
//        System.out.println("THE MATRIX IN REVERSE ORDER");
//
//        for (int i=0;i< array1.length;i++) {
//            for (int j = array1.length-1; j >=0 ; j--) {
//                System.out.print(array1[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.print("\n");
//        }
//        for (int i=0;i< array2.length;i++) {
//            for (int j = array2.length-1; j >=0 ; j--) {
//                System.out.print(array2[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.print("\n");
//        }

        // PROBLEM 5 : REVERSE OF A ARRAY
//        int [] array ={10,20,30,40,50};
//        int l= array.length;
//        int temp;
//       int a= Math.floorDiv(array.length, 2);
//        for (int i=0;i<a;i++){
//            temp=array[i];
//            array[i]=array[l-i-1];
//            array[l-i-1]=temp;
//
//        }
//        for(int element:array){
//            System.out.print(element+" ");
//        }

        // PROBLEM 6 : FIND GREATEST NO IN ARRAY
//        int [] array=new int[5];
//        System.out.println("ENTER THE ARRAY");
//      for (int i=0;i<array.length;i++) {
//
//          array[i]=sc.nextInt();
//      }
//      for(int element:array){
//          System.out.print(element+" ");
//      }
//        System.out.println("\n");
//      for (int i=0;i<array.length;i++){
//        if(array[i]>array[i+1]&&array[i]>array[i+2]&&array[i]>array[i+3]&&array[i]>array[i+4]){
//            System.out.println("GREATEST NO IN ARRAY IS "+array[i]);
//
//        }
//        else if(array[i+1]>array[i]&&array[i+1]>array[i+2]&&array[i+1]>array[i+3]&&array[i+1]>array[i+4]){
//            System.out.println("GREATEST NO IN ARRAY IS " +array[i+1]);
//        }
//        else if(array[i+2]>array[i]&&array[i+2]>array[i+1]&&array[i+2]>array[i+3]&&array[i+2]>array[i+4]){
//            System.out.println("GREATEST NO IN ARRAY IS " +array[i+2]);
//        }
//        else if(array[i+3]>array[i]&&array[i+3]>array[i+1]&&array[i+3]>array[i+2]&&array[i+3]>array[i+4]){
//            System.out.println("GREATEST NO IN ARRAY IS " +array[i+3]);
//        }
//        else{
//            System.out.println("GREATEST NO IN ARRAY IS " +array[i+4]);
//        }
//      }

        /*
        int [] array=new int[5];
        int max=0;
        System.out.println("ENTER THE ARRAY");
    for (int i=0;i<array.length;i++) {
        array[i]=sc.nextInt();
      }
     for(int element:array){
        System.out.print(element+" ");
      }
     System.out.println("\n");
      for (int x:array){
          if(x>max){
              max=x;
          }

      }
        System.out.println("MAX NO IS "+max);

*/


        // PROBLEM 6 : FIND MINIMUM NO IN ARRAY
//        int [] array=new int[5];
//        System.out.println("ENTER THE ARRAY");
//        for (int i=0;i<array.length;i++) {
//
//            array[i]=sc.nextInt();
//        }
//        for(int element:array){
//            System.out.print(element+" ");
//        }
//        System.out.println("\n");
//        for (int i=0;i<array.length;i++){
//            if(array[i]<array[i+1]&&array[i]<array[i+2]&&array[i]<array[i+3]&&array[i]<array[i+4]){
//                System.out.println("MINIMUM NO IN ARRAY IS "+array[i]);
//
//            }
//            else if(array[i+1]<array[i]&&array[i+1]<array[i+2]&&array[i+1]<array[i+3]&&array[i+1]<array[i+4]){
//                System.out.println("MINIMUM NO IN ARRAY IS " +array[i+1]);
//            }
//            else if(array[i+2]<array[i]&&array[i+2]<array[i+1]&&array[i+2]<array[i+3]&&array[i+2]<array[i+4]){
//                System.out.println("MINIMUM NO IN ARRAY IS " +array[i+2]);
//            }
//            else if(array[i+3]<array[i]&&array[i+3]<array[i+1]&&array[i+3]<array[i+2]&&array[i+3]<array[i+4]){
//                System.out.println("MINIMUM NO IN ARRAY IS " +array[i+3]);
//            }
//            else{
//                System.out.println("MINIMUM NO IN ARRAY IS " +array[i+4]);
//            }
//        }

        // PROBLEM NO 7: FIND OUT ARRAY IS SORT OR NOT
//        int [] array={10,20,30,40,50,60};
//        boolean sort=true;
//        for (int i=0;i< array.length-1;i++){
//            if(array[i]>array[i+1]){
//             sort=false;
//             break;
//
//            }
//        }
//        if(sort){
//            System.out.println("ARRAY IS SORT");
//        }
//        else{
//            System.out.println("ARRAY IS NOT SORT");
//        }

    }
}
