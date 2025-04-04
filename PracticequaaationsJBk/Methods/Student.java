package PracticequaaationsJBk.Methods;

import com.sun.tools.javac.Main;

import javax.imageio.stream.ImageInputStream;

public class Student {
    private String Name;
    private int RollNO;
    private int Marks;

    public Student(String name, int rollNO, int marks) {
        Name = name;
        RollNO = rollNO;
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNO() {
        return RollNO;
    }

    public void setRollNO(int rollNO) {
        RollNO = rollNO;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.Marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            this.Marks = 0;
        }
//        public void DisStudent () {
//            System.out.println("Name : " +getName());
//        }

    }
}
