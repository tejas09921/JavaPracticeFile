package StudentGradeManagment;

public class StudentManagmentImplementingClass implements StudentManagment {
    Student s[]=new Student[4];
    int index=0;

    @Override
    public void addStudentData(int Id, String Name, int[] marks) {
        Student student=new Student(Id,Name,marks);
        s[index]=student;
            index++;

    }
}
