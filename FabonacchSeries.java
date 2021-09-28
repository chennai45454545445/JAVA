package com.company;

public class FabonacchSeries {
    public static void main(String[] args) {
        int [] arr =new int[10];
        arr[0]=0;
        arr[1]=1;
        System.out.println("THE FABBONACHI SERIES TILL TO 10 NO IS");
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]);
        for(int i=0;i<= arr.length-3;i++){
            arr[i+2]=arr[i]+arr[i+1];
            System.out.print(" "+arr[i+2]);
        }
    }
}
