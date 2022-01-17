package com.company;
abstract class Base2{
    Base2(int a){
        System.out.println("HELLO!!"+" "+a+" "+"Times");
    }
    public void Hello(){
        System.out.println("Hello");
    }
   abstract public void GoodMorning();
}
class Derived2 extends Base2{

    Derived2(){
        super(10);
        System.out.println("kkkkk");
    }
    public void GoodMorning(){
        System.out.println("GoodMorning.....");
    }
}
public class AbstractClassAndMethod {
    public static void main(String[] args) {
Derived2 d=new Derived2();
d.GoodMorning();
    }
}
