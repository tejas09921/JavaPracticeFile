package TwoDimentionArray.JBK_DataenterINArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array of student :");
        int size= sc.nextInt();
        Student s[]=new Student[size];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter name : " );
            String name= sc.next();
            System.out.println("Enter Rollno : ");
            int stuRollNo= sc.nextInt();
            Student student=new Student(name,stuRollNo);
            s[i]=student;

        }
        System.out.println("Display Student Detail; ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName()+"    "+s[i].getRollno());
        }
    }
}
