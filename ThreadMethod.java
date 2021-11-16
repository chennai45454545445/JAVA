package com.company;
class MynewThread1 extends Thread{

    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }

}
class MynewThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Good Night");
            i++;
        }
    }

}
class MynewThread3 extends Thread{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("SAHIL");
            i++;
        }
    }

}
public class ThreadMethod {
    public static void main(String[] args) {
        MynewThread1 n1=new MynewThread1();
        MynewThread2 n2=new MynewThread2();
        MynewThread3 n3=new MynewThread3();
        n1.start();
        // PHLE N1 KO COMPLETE KREGA FIR N@ CHALEYGVA
        try {
            n1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        n3.start();
        try {
            n3.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        n2.start();


    }
}
