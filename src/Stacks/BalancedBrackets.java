package Stacks;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s="{}()[]";
        System.out.println(isBalanced(s));

    }
    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='(' || a== '{' || a=='['){
                st.push(a);
            }
            else{
                if(st.size()==0) return false;
                else if(a==')' && st.peek()=='(') st.pop();
                else if(a=='}' && st.peek()=='{') st.pop();
                else if(a==']' && st.peek()=='[') st.pop();
                else return false;
            }

        }
        return (st.size()==0);
    }
}
