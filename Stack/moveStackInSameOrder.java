package Stack;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
//        System.out.println("enter the num of element");
//        int n= sc.nextInt();
//        System.out.println("enter the stack elelments");
//        for (int i = 0; i < n; i++) {
//            int x= sc.nextInt();
//            st.push(x);
//        }
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(55);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            int x=st.peek();
            rt.push(st.pop());
        }
        System.out.println(rt);


    }
}
