package com.company;

public class FinallyBlock {
    public static int Divide(){
        try {
            int a=20;
            int b=0;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Proagram is Created");
        }
        return -1;
    }

    public static void main(String[] args) {
int k=Divide();
        System.out.println("Division is"+" "+k );
        int x=80;
        int y=10;
        while (true){
            try {

                System.out.println(x/y);
            }
            finally {
                System.out.println("Proagram Ended");
                break;
            }
        }
        y--;
    }
}
