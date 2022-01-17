package com.company;
class NewSmartPhone extends Phone{
    @Override
    public void call(){
        System.out.println("Jjj");
    }
    @Deprecated
public int Sum(int x,int y){

return x+y;
}
}

public class AnnotationInJava {
@SuppressWarnings("desprecation")
    public static void main(String[] args) {
NewSmartPhone n1=new NewSmartPhone();
n1.call();
        System.out.println(n1.Sum(10,12));

    }
}
