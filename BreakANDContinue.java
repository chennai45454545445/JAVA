package com.company;
import java.util.Scanner;
public class BreakANDContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("FIRST");
        System.out.println("ENTER ANY NUMBER");
        n = sc.nextInt();
        for (i = 200; i <= n; i++) {
            if (i == 250) {
                break;


            }
            System.out.println(i);
        }
        int j=1;
        System.out.println("SECOND");
            do {
                if(j==120){
                    break;
                }
                System.out.println(j);
                j++;

            } while (j <= 300);
            int k=1;
        System.out.println("THIRD");
            while (k<=300){
                System.out.println(k);
                k++;
                if(k==150){
                    break;
                }
            }
        }
    }
