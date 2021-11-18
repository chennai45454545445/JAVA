package com.company;

import java.util.*;
public class GregorianCalander {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.getTime());
            System.out.println(c1.get(Calendar.SECOND));

                System.out.println(c1.get(Calendar.HOUR_OF_DAY) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));



    }
}
