package Reccursion;
import java.util.*;

public class PowerofN {
    public static void main(String[] args) {
        int n=31;
        int a=rev(n,0);;
////        System.out.println(a);
//        System.out.println(pow(n,a));
        int m= (int) Math.pow(n,a);
        System.out.println(m);


    }
//    public static int pow(int n,int a){
//        if(a==0) return 1;
//        int call = pow(n,a/2);
//        if(a%2==0) return call*call;
//        else return n*call*call;
//
//    }
    public static int rev(int n,int r){
        if(n==0){
            return r;
        }
        return rev(n/10,r*10+n%10);
    }
}
