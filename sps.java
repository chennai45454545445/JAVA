package com.company;
import java.util.Scanner;
import java.util.Random;

public class sps
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rc = new Random();
        char c;
       int a=0,b=0;
      int i;       System.out.println("                                      WELCOME IN MY GAME          ");
        System.out.println("S FOR SCISSOR\nP FOR PAPER\nR FOR ROCK\n");
        for(i=1;i<=3;i++){
        System.out.println("YOUR TURN");
       c=sc.nextLine().charAt(0);
       if(c=='R'){
           System.out.println("YOU CHOOSE:ROCK");
       }
       else   if(c=='P'){
           System.out.println("YOU CHOOSE:PAPER");
        }
      else   if(c=='S'){
         System.out.println("YOU CHOOSE:SCISSOR");
       }
      else {
           System.out.println("WRONG CHOICE");
        }

     int r=rc.nextInt(3);
        if(r==0){
           System.out.println("SYSTEM CHOOSE:ROCK");
        }
     else if(r==1){
           System.out.println("SYSTEM CHOOSE:PAPER");
       }
       else if(r==2){
            System.out.println("SYSTEM CHOOSE: SCISSOR");
        }
           if((c=='R'&& r==2)||(c=='P'&& r==0)||(c=='S'&& r==1)){
           System.out.println("YOU WIN\n");
            a++;
        }
            else if((c=='R'&& r==1)||(c=='P'&& r==2)||(c=='S'&& r==0)){
                System.out.println(" SYSTEM WIN\n");
                b++;
            }
            else if((c=='R'&& r==0)||(c=='P'&& r==1)||(c=='S'&& r==2)){
                System.out.println("TIE\n");
            }


       }
        System.out.println("\nFINAL RESULT IS:-\n\tUSER\tSYSTEM\n\t "+a+"\t    "+b);

      if(a>b){
           System.out.println("YOU ARE WINNER");
       }
       else if(a<b){
            System.out.println("COMPUTER WINS");
        }
        else{
           System.out.println("MATCH TIE");
   }


    }
}