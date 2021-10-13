package com.company;
 interface AdvancedEnggMaths{
   void Maths1();
   void Maths2();
}
 interface EnggMaths extends AdvancedEnggMaths{
    void Maths3();
    void Maths4();
}
class MySolvedQuestion implements EnggMaths{
    public  void Maths1(){
        System.out.println("Maths1");
    }
    public  void Maths2(){
        System.out.println("Maths2");
    }
  public  void Maths3(){
      System.out.println("Maths3");
    }
 public  void Maths4(){
     System.out.println("Maths4");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
MySolvedQuestion s1=new MySolvedQuestion();
s1.Maths1(); s1.Maths2();s1.Maths3();s1.Maths4();

    }
}
