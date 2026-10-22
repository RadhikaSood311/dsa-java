package Reccursion;
import java.util.*;

public class subsets {
    public static void main(String[] args) {
        String s = "abc";
        String a="";
        strr(s,a,0);


    }
    public static void strr(String s,String a,int indx){
        if(indx==s.length()){
            System.out.println(a);
            return;
        }
        char b=s.charAt(indx);
        strr(s,a+b,indx+1);
        strr(s,a,indx+1);
    }

}
