package com.company;
class Mythread3 extends Thread{
    public Mythread3(String m){
        super(m);
    }
public void run(){

        while (true) {
            System.out.println("Good Morning");


        }
}
}
public class ThreadPriority {
    public static void main(String[] args) {
        Mythread3 m1=new Mythread3("OS");
        Mythread3 m2=new Mythread3("AOA");
        Mythread3 m3=new Mythread3("CGM");
        Mythread3 m4=new Mythread3("CD (MOST)");
        m3.setPriority(Thread.MAX_PRIORITY);
      m1.start();
      m2.start();
      m3.start();

      m4.start();


    }
}
