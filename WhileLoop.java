package com.company;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int i=100; int e=0;
        while(i<=200){
            System.out.println(i);
            i++;
        }
       Scanner sc=new Scanner(System.in);
       String str;
       int Roll;
        System.out.println("NAME");
        str=sc.nextLine();
     System.out.print("ROLL NO");
      Roll=sc.nextInt();

       while (str=="sahil"||Roll==10){
            System.out.println("PERCENTAGE IS 89%");
           break;

        }

    }

}
