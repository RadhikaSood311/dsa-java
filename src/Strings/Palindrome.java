package Strings;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(rev.equals(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
