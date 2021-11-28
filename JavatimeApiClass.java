package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
public class JavatimeApiClass {
    public static void main(String[] args) {
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDate D=LocalDate.now();
        System.out.println(D);
        LocalDateTime Dt=LocalDateTime.now();
        System.out.println(Dt);
    }
}
