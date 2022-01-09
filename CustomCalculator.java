package com.company;
import java.util.*;
class MaxNumberException extends Exception{
    @Override
    public String toString(){
        return "Number is not allow greator than 10000";
    }
    @Override
    public String getMessage(){
        return "Number cannot be negative";
    }
}
class ReservedNumber extends Exception{
    @Override
    public String toString(){
        return "8 and 9 are not allowed";
    }

}
class CustomCalculators{
    double add(double x,double y) throws ReservedNumber{
        if (x==8||y==9){
            throw new ReservedNumber();
        }
        return (x+y);
    }
    double sub(double x,double y) throws ReservedNumber {
        if(x<0||y<0){
            throw new ReservedNumber();
        }
        return (x-y);
    }

    double mul(double x,double y) throws MaxNumberException{
        return (x*y);
    }

    double div(double x,double y) throws MaxNumberException{
        return (x/y);
    }

}
public class CustomCalculator {
    public static void main(String[] args) throws ReservedNumber,MaxNumberException {
        CustomCalculators c1=new CustomCalculators();

            c1.add(8,9);




    }
}
