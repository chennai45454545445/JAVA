package com.company;
interface My{
    public void A();

}
public class AnonymousClass {
    public static void main(String[] args) {
        My n1=new My() {
            @Override
            public void A() {
                System.out.println("Hello");
            }
        };
        n1.A();
    }
}
