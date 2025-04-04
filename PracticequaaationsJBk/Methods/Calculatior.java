package PracticequaaationsJBk.Methods;

public class Calculatior {
    public void add(){
        System.out.println("in these add method perform add Oprations");
    }
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a1 ,double b1,double c1){
        return a1+b1+c1;
    }

    public static void main(String[] args) {
        Calculatior cal=new Calculatior();
        cal.add();
        System.out.println(cal.add(5,5));
        System.out.println(cal.add(5,5,5));
    }
}
