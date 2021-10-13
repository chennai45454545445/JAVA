package com.company;
class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("I AM COOKING");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("I AM SINGING");
            i++;
        }
    }
}
public class ThreadingRunInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 Bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(Bullet1);
        MyThreadRunnable2 Bullet2 =new MyThreadRunnable2();
        Thread gun2=new Thread(Bullet2);
        gun1.start();
        gun2.start();
    }
}
