package com.company;
class Base1{
    Base1(){
        System.out.println("I am a Base1 Class Constructor");
    }
    Base1(int x){
        System.out.println("I am a Base1 Class Contructor with value of x "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){

        System.out.println("I am a Derived1 Class Constructor ");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a Derived1 Class Constructor With value of y "+y);

    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        Derived1 d=new Derived1(10,20);

    }
}
