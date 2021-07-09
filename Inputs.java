
package com.company;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int sum;
        System.out.println("ENTER STRING");
        String str= sc.next();
        System.out.println(str);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter a:");
        b=sc.nextInt();
        sum=(int)(a+b);
        System.out.println("The Sum is : "+sum);
        boolean b1 = sc.hasNextInt(); // Validy check kr raha hai ki input data int hai ki nahi
        System.out.println(b1);









    }
}
