package Strings;
import java.util.*;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        String a = "";
        a+=n;
        System.out.println(a);
        System.out.println(s);
    }
}
