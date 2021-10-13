package com.company;
class circle{
    public int radius;
    circle(int r){
        this.radius=r;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int h){
        super(10);
        this.height=h;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
public class PracticeInheritance_ch_10 {
    public static void main(String[] args) {
        // PROBLEM 1
        cylinder1 obj =new cylinder1(10);
        circle obj1=new circle(10);
        System.out.println(obj.volume());


    }
}
