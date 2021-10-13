package com.company;

public class PracticeJavaMethod {
    static int table(int n){
        int table;
        for(int i=1;i<=10;i++){
            table=n*i;
            System.out.println(table);
        }
        return 0;
    }
    static void pattern(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int z) {
        for (int i = z; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static int naturalnosum(int l){
        int sum=0;
        if(l==1){

            System.out.println(l);

        }
        else {
            for (int i = 1; i <= l; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        return sum;
    }
    static int average(int ...arr){
        int sum=0;
   for(int element:arr) {
          sum=sum+element;
       }
//        for(int i=0;i< arr.length;i++){
//            sum=sum+arr[i];
//        }
        System.out.println(sum);
        return sum;
    }
   static int sumrecursive(int n){
        if(n<=1){
            return n;
        }
        else {
            return n + sumrecursive(n - 1);
        }


   }
    static void recpattern(int n){
        if(n>0){
            recpattern(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void recpattern1(int n){
        if(n>0){
            recpattern(n-1);
            for (int i=n;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void digreetofara(int n){
   float fara;
     fara=(n*9.0f/5.0f)+32.0f;

        System.out.println(fara+"f");
    }


    public static void main(String[] args) {
//        table(5);
//        pattern(5);
//       pattern1(5);
//    average(5,5,5,5,5);
// recpattern(5);
//   recpattern1(5);
// digreetofara(5);
    // System.out.println(sumrecursive(10));


    }
}
