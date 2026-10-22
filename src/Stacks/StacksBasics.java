package Stacks;

import java.sql.SQLOutput;
import java.util.Stack;

public class StacksBasics {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Akash");
        st.push("Radhika");
        st.push("Nikhil");
        st.push("Rhythm");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        String s = st.pop();
        System.out.println(s);
        System.out.println(st.isEmpty());


    }
}
