package Stacks;

import java.util.Stack;

public class PushEleAtBottomRec {
    public static void pushAtBot(Stack<Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int s=st.pop();
        pushAtBot(st,ele);
        st.push(s);


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        int ele=5;
        pushAtBot(st,ele);
        System.out.println(st);
    }
}
