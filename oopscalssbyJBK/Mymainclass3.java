package oopscalssbyJBK;

import java.util.Scanner;

public class Mymainclass3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        Student s6=new Student();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of student: ");
        s1.name= sc.nextLine();
        System.out.println("enter the rollno of student");
        s1.RollNo= sc.nextInt();

        System.out.println("enter the name of student2: ");
        s2.name= sc.nextLine();
        System.out.println("enter the rollno of student2");
        s2.RollNo= sc.nextInt();

        System.out.println("enter the name of student: ");
        s3.name= sc.nextLine();
        System.out.println("enter the rollno of student");
        s3.RollNo= sc.nextInt();

        System.out.println("enter the name of student: ");
        s4.name= sc.nextLine();
        System.out.println("enter the rollno of student");
        s4.RollNo= sc.nextInt();

        System.out.println("Name: "+s1.name+"RollNO: "+s1.RollNo);
        System.out.println("Name: "+s2.name+"RollNO: "+s2.RollNo);
        System.out.println("Name: "+s3.name+"RollNO: "+s3.RollNo);
        System.out.println("Name: "+s4.name+"RollNO: "+s4.RollNo);
    }
}
