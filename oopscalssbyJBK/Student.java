package oopscalssbyJBK;

import java.util.Scanner;

public class Student {
    String name;
    int RollNo;

    void inputdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of student: ");
        name= sc.nextLine();
        System.out.println("enter the rollno of student");
        RollNo= sc.nextInt();
    }
    void displaydata(){
        System.out.println("Name: "+name+" Rollno: "+RollNo);
    }

}
