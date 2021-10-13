package com.company;
class Phone{
    public void call(){
        System.out.println("Calling.....in Phone");
    }
    public void On(){
        System.out.println("Turn on my phone");
    }

}
class SmartPhone extends Phone{
    public void Message(){
        System.out.println("Read My Messages");
    }
    public void call(){
        System.out.println("Calling.....I Phone 12 Pro MAX");

    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        obj.call();
        obj.On();

    }
}
