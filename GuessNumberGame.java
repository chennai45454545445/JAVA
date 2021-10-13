package com.company;
import java.util.Scanner;
import java.util.Random;
class GuessGame{
    Scanner sc=new Scanner(System.in);
    Random rc=new Random();
    int random;
    int User;
    public void setRandom(){
        random=rc.nextInt(10);

    }
    public void showRandom(){
        System.out.println("Computer Chosse"+random);

    }

    public void Check(){
        int j=0;
        while(j<10) {
            System.out.println("Enter The Number::");
            User = sc.nextInt();
            j++;
            if (User == random) {
                System.out.println("TRUE");
                break;
            }
        }

    }
}
public class GuessNumberGame {
    public static void main(String[] args) {
        GuessGame game1=new GuessGame();
        game1.setRandom();
        game1.Check();
        game1.showRandom();

    }
}
