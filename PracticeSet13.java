package com.company;
class Mynewthread1 extends Thread{

    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(40);
            }
            catch (Exception e){
                System.out.println(e);
            }
            i++;
        }
    }

}
class Mynewthread2 extends Thread{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Welcome");
            i++;
        }
    }

}
class Mynewthread3 extends Thread{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("SAHIL");
            i++;
        }
    }

}
public class PracticeSet13 {
    public static void main(String[] args) {
        Mynewthread1 n1=new Mynewthread1();
        Mynewthread2 n2=new Mynewthread2();
        //proagram1
        n1.start();
        try{
            n1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        n2.start();

    }
}
