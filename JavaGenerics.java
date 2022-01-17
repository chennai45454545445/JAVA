package com.company;
import java.util.*;
class MyGeneric<T1>{
    int a=34;
    private T1 t1;
    public MyGeneric(int val,T1 t1){
this.a=val;
this.t1=t1;


    }

    public int getA() {
        return a;
    }


    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class JavaGenerics {
    public static void main(String[] args) {
        MyGeneric g1=new MyGeneric(14,"y");
        System.out.println(g1.getA());


    }
}
