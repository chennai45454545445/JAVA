package com.company;
import java.util.Scanner;
class MyExceptions extends Exception{
    public String toString(){
      return ("Arithmatic Exception Occcured");
    }
    public String getMessage(){
        return ("Invalid Value");
    }
}
  class Calculator1{
     Scanner sc=new Scanner(System.in);
     public  void calci() throws MyExceptions{
     char choice;
         int a,b,c;
         System.out.println("Enter your choice");
     choice=sc.next().charAt(0);

         switch (choice){
             case '+':
                 System.out.println("Enter the first value");
                 a=sc.nextInt();
                 System.out.println("Enter the first value");
                 b=sc.nextInt();
                 if(a<0||b<0){
throw new MyExceptions();
                 }
                 System.out.println("SuM IS"+(a+b));
                 break;
             case '-':
                 System.out.println("Enter the first value");
                 a=sc.nextInt();
                 System.out.println("Enter the first value");
                 b=sc.nextInt();
                 if(a<0||b<0){
                     throw new MyExceptions();
                 }
                 System.out.println("SuM IS"+(a-b));
                 break;
             case '/':
                 System.out.println("Enter the first value");
                 a=sc.nextInt();
                 System.out.println("Enter the first value");
                 b=sc.nextInt();
                 if(a<0||b<0){
                     throw new MyExceptions();
                 }
                 System.out.println("SuM IS"+(a/b));
                 break;
         }
     }

}
public class JavaCalculator1 {
    public static void main(String[] args) {
        Calculator1 c1=new Calculator1();
        try {
            c1.calci();
        }
        catch (Exception e){
            System.out.println(e.toString());


        }

    }
}
