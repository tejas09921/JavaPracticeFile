package methods;

import java.util.Scanner;

class Algebra{
    int a;
    int b;
    Algebra(int x,int y){
        System.out.println("Constuctor of algebra called");
        a=x;
        b=y;
    }
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }
}
public class main{
    public static void main(String[] args) {
        Algebra obj=new Algebra(5,6);
        Scanner sc=new Scanner(System.in);
      //  int x=sc.nextInt();
      //  int y= sc.nextInt();

        System.out.println("someof two num is");

        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
        System.out.println(obj.add(5,6));

    }
}
