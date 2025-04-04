package OOPS;

public class simple {
    public static class student{ //this is known as a class
        String name;
        int rno;
        double persent;
    }
    public static void main(String[] args) {
        student x=new student();       //this is known as a object
        x.name="tejas";
        x.rno=50;
        x.persent=90.5;
        System.out.println(x.name);
        student y=new student();       //this is known as a object
        y.name="aarav";
        y.rno=55;
        y.persent=90.5;
        System.out.println(y.name);
    }
}
