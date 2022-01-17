package com.company;
abstract class practice3{
    // In abstract class which have abstarct method and also concrete method
   abstract public void greet();
   abstract public void sayHello();
   public void goodNight(){
        System.out.println("HHHHHHH");
    }

}
 interface iPhone{
    // In interface all method are define ,concrete method are not alowed
    public void call();
    public void photo();


}
 class practice2 extends practice3 implements iPhone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public void call(){
        System.out.println("calling...........");
    }
    public void photo(){
        System.out.println("Click Photo");
    }
}

public class PracticeR {
    public static void main(String[] args) {
        practice2 p2=new practice2();
        p2.sayHello();
practice3 p3=new practice2(); //----> Dynamic Dispatched method

p3.goodNight();

        
    }
}
