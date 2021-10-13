package com.company;
class Base{
    int x;

    public int getX() {
        System.out.println("Hello I am a Base class");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("I am in Derived Class");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d=new Derived();
        d.setX(3);
        d.setY(10);
        System.out.println(d.getX());
        System.out.println(d.getY());

    }
}
