package com.company;
class Mythread extends Thread{
    public Mythread(String name){
        super(name);
       System.out.println(name);

    }
    public Mythread( Runnable r, String name){
        super(name);
        System.out.println(name);

    }
public void run(){
    System.out.println("Hello");
}

}
public class ConstructorThread {
    public static void main(String[] args) {
        Thread gun1=new Thread();
        Mythread m = new Mythread(gun1,"sahil");
        Mythread x = new Mythread("sahil");

        m.start();

    }
}
