package com.company;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    int salary;
    int experince;
    public void EmployeeDetails(){
        System.out.println("EMPLOYEE NAME IS "+name);
        System.out.println("EMPLOYEE ID IS "+id);

    }
    public void EmployeeSalary(){
        System.out.println("SALARY ::"+salary);
    }
    public void Employeeexperince(){
        System.out.println("WORK EXPERINCE "+experince);

    }
}
class Student{
    Scanner sc=new Scanner(System.in);
    int Rollno;
    String Name;
    int math,english,hindi,sst,science;
    int result; int total=500;
    public void SetData(){
        System.out.println("ENTER THE MATHS MARKS");
        math=sc.nextInt();
        System.out.println("ENTER THE ENGLISH MARKS");
        english=sc.nextInt();
        System.out.println("ENTER THE HINDI MARKS");
        hindi=sc.nextInt();
        System.out.println("ENTER THE SST MARKS");
        sst=sc.nextInt();
        System.out.println("ENTER THE SCIENCE MARKS");
        science=sc.nextInt();
    }
    public void Result(){
        result=(int)(math+english+hindi+sst+science/total)*100;
        System.out.println("THE RESULT IS"+result);

    }

}
class RtuResult{
    Scanner sc=new Scanner(System.in);
    int math,english,hindi,sst,science;
    int rollno;
    String father;

    public void RtuResults(){
        System.out.println("Enter Your Roll No");
        rollno=sc.nextInt();
        System.out.println("Enter Your Father Name");
        father=sc.nextLine();
        if((rollno==1900)||(father=="Ram Charndra")){
            math=89;english=77;hindi=88;sst=88;science=99;
            System.out.println("ROLL NO:"+rollno);
            System.out.println("STUDENT NAME :"+"Rahul Chandra");
            System.out.println("FATHER NAME:"+father);
            System.out.println("MATHS MARKS "+math);
            System.out.println("ENGLISH MARKS "+english);
            System.out.println("HINDI MARKS"+hindi);
            System.out.println("SST MARKS"+sst);
            System.out.println("SCIENCE MARKS"+science);
        }
        else if((rollno==1901||father=="Om Prakash")){
            math=82;english=78;hindi=81;sst=83;science=92;
            System.out.println("ROLL NO:"+rollno);
            System.out.println("STUDENT NAME :"+"Om Prakash");
            System.out.println("FATHER NAME:"+father);
            System.out.println("MATHS MARKS "+math);
            System.out.println("ENGLISH MARKS "+english);
            System.out.println("HINDI MARKS"+hindi);
            System.out.println("SST MARKS"+sst);
            System.out.println("SCIENCE MARKS"+science);

        }
        else if((rollno==1902||father=="Manoj Kumar")){
            math=82;english=78;hindi=81;sst=83;science=92;
            System.out.println("ROLL NO:"+rollno);
            System.out.println("STUDENT NAME :"+"Manoj Kumar");
            System.out.println("FATHER NAME:"+father);
            System.out.println("MATHS MARKS "+math);
            System.out.println("ENGLISH MARKS "+english);
            System.out.println("HINDI MARKS"+hindi);
            System.out.println("SST MARKS"+sst);
            System.out.println("SCIENCE MARKS"+science);

        }


    }

}
public class JavaClass {
    public static void main(String[] args) {
//       Employee harry=new Employee();
//       harry.id=1;
//       harry.name="Harry Sharma";
//       harry.salary=100000;
//       harry.experince=4;
//       harry.EmployeeDetails();
//       harry.EmployeeSalary();
//       harry.Employeeexperince();
//       Student Exam=new Student();
//       Exam.SetData();
//       Exam.Result();

RtuResult rtu=new RtuResult();
rtu.RtuResults();

    }
}
