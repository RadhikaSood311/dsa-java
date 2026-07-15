package Strings;
import java.util.*;

public class SumOfAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String a =s.substring(i,j);
                sum+=Integer.parseInt(a);
            }
        }
        System.out.println(sum);
    }
}
