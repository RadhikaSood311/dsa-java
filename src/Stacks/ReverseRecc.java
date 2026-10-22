package Stacks;

import java.util.Stack;

public class ReverseRecc {
    public static void pushAtBot(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int s=st.pop();
        pushAtBot(st,ele);
        st.push(s);
    }
    public static void rev(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        rev(st);
        pushAtBot(st,top);


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        rev(st);
        System.out.println(st);

    }
}
