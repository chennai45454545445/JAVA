import java.util.Scanner;
import java.util.Random;

public class gg
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Game");

        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        int u=0;
        int s=0;
        System.out.println("R-for Rock \nP-for Paper and\nS-for Scissor");
        for (int i=1; i<=3; i++){

            System.out.println("\n\tRound-"+i+"\nEnter your option: ");

            char a=sc.next().charAt(0);
            if(a=='R'){
                System.out.println("User:- Rock");
            }else if(a=='P'){
                System.out.println("User:- Paper");
            }else if(a=='S'){
                System.out.println("User:- Scissor");
            }else {
                System.out.println("You entered wrong option.");
            }

            int b=rc.nextInt(3);
            if(b==0){
                System.out.println("System:- Rock");
            }else if(b==1){
                System.out.println("System:- Paper");
            }else if(b==2){
                System.out.println("System:- Scissor");
            }

            if((a=='R'&&b==2)||(a=='P'&&b==0)||(a=='S'&&b==1)){
                System.out.println("You Win!");
                u++;
            }else if((a=='R'&&b==1)||(a=='P'&&b==2)||(a=='S'&&b==0)){
                System.out.println("You Lose!");
                s++;
            }else if((a=='R'&&b==0)||(a=='P'&&b==1)||(a=='S'&&b==2)){
                System.out.println("DRAW!, Same options Collide");
            }

        }
        System.out.println("\nFinal Result is:- \n\tUser\tSystem\n\t "+u+"\t   "+s);
        if(u>s){
            System.out.println("\tYou WON the series");
        }else if(u<s){
            System.out.println("\tYou LOSE the series,\n\tTry next time!");
        }else if(u==s){
            System.out.println("\tSeries DRAW");
        }

    }
}