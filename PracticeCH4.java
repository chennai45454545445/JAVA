package com.company;
import java.util.Scanner;


public class PracticeCH4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        float Income;
//        float tax=0;
//        System.out.println("Enter your Yearly Income");
//        Income=sc.nextFloat();
//        if(Income<=2.5f){
//            tax=tax+0;
//            System.out.println("No Tax Is Require");
//        }
//        else if(Income>2.5f&&Income<=5.0f){
//            tax=tax+0.05f*(Income-2.5f);
//            System.out.println("THE TAX FOR YEARLY INCOME BTWN 2.5 Lakh to 5 Lack"+tax);
//
//        }
//        else if(Income>5.0f&&Income<=10.0f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.02f*(Income-5.0f);
//            System.out.println("THE TAX FOR YEARLY INCOME BTWN 5 Lakh to 10 Lack"+tax);
//
//        }
//        else if(Income>10.0f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.02f*(10.0f-5.0f);
//            tax=tax+0.03f*(Income-10.0f);
//            System.out.println("THE TAX FOR YEARLY INCOME Greator than 10 Lakh" +tax);


//        }
//        System.out.println("1 For Monday 2 For Tuesday 3 For Wednesday 4 For Thrusday 5 For Friday 6 for Saturday 7 For Sunday");
//        int Choice;
//        Choice=sc.nextInt();
//        switch (Choice){
//            case 1:
//                System.out.println("Monday");
//                  break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//            default:
//                System.out.println("Error");
//
//        }

//        int Year;
//        System.out.println("Enter Year");
//        Year=sc.nextInt();
//        if((Year%4==0) &&(Year%400==0)||(Year%100==0)){
//            System.out.println("Year is A leap Year");
//        }
//        else{
//            System.out.println("Not a Leap Year");
//        }
        String str;
        System.out.println("ENTER WEBSITE");
        str=sc.nextLine();
        if(str.endsWith(".com")){
            System.out.println("This is COM Website");
    }
        else if(str.endsWith(".net")){
            System.out.println("This is NET Website");
        }
    }
}
