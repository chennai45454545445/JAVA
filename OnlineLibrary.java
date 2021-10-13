package com.company;
import java.util.Scanner;
class Library{
String arr[]={"Maths","Hindi","English","Gk","Accounts","Science","Toc","Mpi"};
int rollno; String Name; String BookName;
    public void showAvailableBook(){
        System.out.println("Available Books:");
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
    }
    public void issueBook(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++) {
            System.out.println("Enter RollNo:");
            rollno = sc.nextInt();
            System.out.println("Enter Name:");
            Name = sc.next();
            System.out.println("Enter BookName:");
            BookName = sc.next();
            System.out.println("The Book" +BookName+ "Issued by" +Name);

        }

    }



}
public class OnlineLibrary {
    public static void main(String[] args) {
        Library Pathshala=new Library();
        Pathshala.showAvailableBook();
        Pathshala.issueBook();

    }
}
