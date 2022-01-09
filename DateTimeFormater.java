package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateTimeFormater {
    public static void main(String[] args) {
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy--E H:m a");

        String s=t.format(df);
        System.out.println(s);


    }
}
