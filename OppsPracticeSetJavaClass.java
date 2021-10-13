package com.company;
class Employe{
    int salary;
    String name;
    public int getSalary(int n){
        salary=n;
        return salary;

    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
class CellPhone{
    public void ringing(){
        System.out.println("Ringing......");
    }
    public void vibrating(){
        System.out.println("Vibrating......");
    }
    public void callfriend(){
        System.out.println("Calling....");
    }
}
class Square{
    int side;
    public int Areaofsquare(){
        return side*side;

    }
    public int Parameterofsquare(){
        return 4*side;
    }
}
class Rectangle{
   int l;
   int b;
    public int Areaofrectangle(){
        return l*b;
    }
    public int Parameterofrectangle(){
        return 2*(l+b);
    }
}
class RockStarGames{
    public void Firing(){
        System.out.println("Firing..-->>>>");

    }
    public void Running(){
        System.out.println("Running.,.,.,.");

    }
    public void Jump(){
        System.out.println("Jump00||??");

    }
}
class Circle{
    double radius;
    double pie=3.14;
    public double AreaOfCircle(){
        return pie*radius*radius;
    }
}
public class OppsPracticeSetJavaClass {
    public static void main(String[] args) {
        //PROBLEM 1
//        Employe sahil=new Employe();
//        sahil.setName("SAHIL");
//        System.out.println(  sahil.getSalary(40000));
//        System.out.println(sahil.getName());

        //PROBLEM 2
//        CellPhone iphone=new CellPhone();
//        iphone.ringing();
//        iphone.vibrating();
//        iphone.callfriend();

        //PROBLEM 3
//        Square sq1=new Square();
//        sq1.side=23;
//        System.out.println(sq1.Areaofsquare());
//        System.out.println(sq1.Parameterofsquare());

        //PROBLEM 4
//        Rectangle rec1=new Rectangle();
//        rec1.l=14;
//        rec1.b=10;
//        System.out.println(rec1.Areaofrectangle());
//        System.out.println(rec1.Parameterofrectangle());

        //PROBLEM 5
//        RockStarGames Gta=new RockStarGames();
//        Gta.Firing();
//        Gta.Jump();
//        Gta.Running();

        //PROBLEM 6
        Circle circle1=new Circle();
        circle1.radius=5;
        System.out.println(circle1.AreaOfCircle());


    }
}
