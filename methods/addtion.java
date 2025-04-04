package methods;

import java.util.Scanner;

public class addtion {

    int add(int a,int b){
        int ans=a+b;
        return ans;
    }
    public static void main(String[] args) {
        addtion obj=new addtion();
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("sum of input num is:");
        int ans=obj.add(a,b);
        System.out.println(ans);
    }
}
