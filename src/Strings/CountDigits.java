package Strings;
import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        int n=00234;
        double d=000.32400;
        String s = Integer.toString(n);
        String a = Double.toString(d);
        System.out.println(s.length());
//        0 count nhi honge
        System.out.println(a.length());
//        point se pehle vala 1 zero count hoga point count hoga
        String b = "23456";
        int g = Integer.parseInt(b);
        System.out.println(g);
    }
}
