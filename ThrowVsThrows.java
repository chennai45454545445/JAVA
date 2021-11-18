package com.company;
class NegativenNumber extends Exception{
    @Override
    public String toString(){
        return "Negative Number are not allowed";
    }
    @Override
    public String getMessage(){
        return "Number cannot be negative";
    }
}
public class ThrowVsThrows{
    public static double area(int r) throws NegativenNumber{
        if(r<0){
            throw new NegativenNumber();
        }
       double results= Math.PI*r*r;
       return results;

    }
    public static double Divide  (int x,int y)  throws ArithmeticException{
int result=x/y;
return result;
    }
    public static void main(String[] args) {
        try {
            double c= Divide(10,5);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Arithmatic Exception OCccured");

        }
try {
    double k=area(-1);
    System.out.println(k);
}
catch (Exception e){
    System.out.println(e.toString());
    System.out.println(e.getMessage());

}
    }
}
