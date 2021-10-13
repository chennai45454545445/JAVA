package com.company;
interface Sahil{
    void GoodMorning();
    void GoodAfternoon();
    void GoodNight();

}
interface Ansari{
    void Hello();
    void Bye();
}
class Shabnam implements Sahil,Ansari{
    public void GoodMorning(){
        System.out.println("GoodMorning......");
    }
  public  void GoodAfternoon(){
        System.out.println("GoodAfternoon......");
    }
    @Override
    public void Hello() {

    }
    @Override
    public void Bye() {

    }

    public  void GoodNight(){
        System.out.println("GoodNight.......");

    }
}
class Salma extends Shabnam{

}
public class InterfacesInJava {
    public static void main(String[] args) {
        Shabnam s1=new Shabnam();
Salma s2=new Salma();
s2.GoodAfternoon();

    }
}
