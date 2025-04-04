package StudentGrademanag;

import java.net.IDN;
import java.util.Scanner;

public class StudentGradeManagment extends Student {
    static Student[] stu = new Student[100]; // Array to store students
    static int count = 0; // Count of students
    static Scanner sc = new Scanner(System.in);

    public StudentGradeManagment(int id, String name, int[] marks) {
        super(id, name, marks);
    }

    private static void viewStudents() {
        if (count == 0) {
            System.out.println("No students found!");
        } else {
            System.out.println("\nStudent List");
            for (int i = 0; i < count; i++) {
                stu[i].displayStudent();
            }
        }
    }


    public static void main(String[] args) {

        if (count == 0) {
            System.out.println("data not avalable firstly add student");
        } else {
            System.out.println("\nStudent List");
            for (int i = 0; i < count; i++) {
                stu[i].displayStudent();
            }
        }


        while (true) {
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    AddStudentDetail();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void AddStudentDetail() {
        if (count >= stu.length) {
            System.out.println("Student list is full!");
            return;
        }
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + ( i + 1 ) + ": ");
            marks[i] = sc.nextInt();
        }
        stu[count++] = new Student(id, name, marks);
        System.out.println("Student added successfully!");

    }
}

