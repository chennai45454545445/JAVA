package com.company;
import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {

        float English;
        float Maths;
        float Hindi;
        float Obtain;
        float Percentage;
        float PerEnglish;
        float PerMaths;
        float PerHindi;

        float Total=300;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English marks");
        English=sc.nextFloat();
        System.out.println("Enter Maths marks");
        Maths=sc.nextFloat();
        System.out.println("Enter Hindi marks");
        Hindi=sc.nextFloat();
        PerEnglish=(float)((English/100)*100);
        PerMaths=(float)((Maths/100)*100);
        PerHindi=(float)((Hindi/100)*100);
        Obtain= (float)(English+Maths+Hindi);
        Percentage= (float)((Obtain/Total)*100);
        System.out.println("percentage in English :"+PerEnglish);
        System.out.println("percentage Maths :"+PerMaths);
        System.out.println("percentage Hindi :"+PerHindi);
        System.out.println("The Total percentage is :"+Percentage);

        if(PerEnglish>=33){
            if(PerMaths>=33){
                if(PerHindi>=33){
                    if(Percentage>=44){
                        System.out.println("You Pass in the Examination");
                    }
                }
            }
        }
        else{
            System.out.println("You Failed in the Examination");
        }


    }
}
