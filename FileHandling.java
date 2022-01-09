package com.company;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Create a new File

        File f1=new File("Sahil.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write in a File

        try {
            FileWriter fileWriter=new FileWriter("Sahil.txt");
            fileWriter.write("This is a good Book" +
                    "My name is Sahil Ansari");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Read in a fle
       File myFile =new File("A.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while (sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
