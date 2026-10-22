package Stacks;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        while(st.size()>0){
            int a=st.pop();
            System.out.print(a+" ");
            helper.push(a);
        }
        System.out.println();
        while(helper.size()>0){
            int a=helper.pop();
            System.out.print(a+" ");
            st.push(a);
        }
    }
}
