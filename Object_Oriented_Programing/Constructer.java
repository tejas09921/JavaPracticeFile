package Object_Oriented_Programing;

public class Constructer {
    public static void main(String[] args) {
        System.out.println("this is constucrtor program");
        student s1=new student("tejal");
        System.out.println(s1.name);
    }
}
class student{
    String name;
    int rollno;
    student(String name){
        this.name=name;
    }
}
