package StudentGrademanag;

public class Student implements StudentOperations{
    int id;
    String name;
    int[] marks;
    int totalMarks;
    double percentage;
    int grade;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        calculateResults();
    }

    @Override
    public void calculateResults() {
        totalMarks=0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks=marks[i]+totalMarks;
        }
        percentage=(double) totalMarks/3;
    }

    @Override
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Total Marks: " + totalMarks + ", Percentage: " + String.format("%.2f", percentage) + "%, Grade: " + grade);
    }
}
