package com.company;
class MyEmployee{
    private int id;
    private String name;
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }
    public void setName(String i){
        name=i;
    }
    public String getName(){
        return name;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee emp=new MyEmployee();
        emp.setId(15);
        emp.setName("SAHIL");
        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}
