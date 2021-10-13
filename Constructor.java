package com.company;
class Students{
    int Rollno;
    String name;
    Float result;
   public Students(int n,String x){
       Rollno=n;
       name=x;
    }
    public Students(String myname){
        Rollno=15;
   name=myname;
        result=88.2f;
    }
    public void SetRoll(int n){
        Rollno=n;
    }
    public int GetRoll(){
      return Rollno;
    }
    public void SetName(String n){
       name=n;
    }

    public String GetName(){
        return name;
    }
}
public class Constructor {
    public static void main(String[] args) {
//        Students s1=new Students("SAHIL");
        Students s1=new Students(20,"sahil");
        System.out.println(s1.GetRoll());
     System.out.println(s1.GetName());


    }
}
