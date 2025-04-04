package Stack;

import java.util.*;

public class EnterElementAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack temp=new Stack<>();
        int n=7;
        int idx=2;
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(n);
        while (temp.size()>0){
       //     st.push(temp.pop());
        }
        System.out.println(st);

    }
}
