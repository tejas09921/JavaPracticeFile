package classandobject;

public class multiple_objects {
    int age;
    String name;

    public static void main(String[] args) {
        multiple_objects obj1=new multiple_objects();
        obj1.age=10;
        obj1.name="tejas";
        System.out.println(obj1.age);
        System.out.println(obj1.name);

        multiple_objects obj2=new multiple_objects();
        obj2.age=20;
        obj2.name="patil";
        System.out.println(obj2.age);
        System.out.println(obj2.name);

        multiple_objects obj3=new multiple_objects();
        obj3.age=30;
    }
}
