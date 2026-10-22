package Reccursion;

public class NaturalNumbers {
    public static void num(int n){
        if(n==0) return;
        System.out.println(n);
        num(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        num(4);
    }
}
