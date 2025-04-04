package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> qt=new Stack<>();
        while (rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println(qt);
        while (qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }
}
