package com.company;
class A{
    public void Hello(){
        System.out.println("IN CLASS A");
    }


}
class B extends A{
    @Override
    public void Hello(){
        System.out.println("IN CLASS B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
B b=new B();
b.Hello();
    }
}
