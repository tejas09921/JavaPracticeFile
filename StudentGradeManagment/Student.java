package StudentGradeManagment;

public class Student {
    int id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(int id, String name, int[] marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int [] marks=new int[3];




}
