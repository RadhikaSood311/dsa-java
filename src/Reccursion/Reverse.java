package Reccursion;

public class Reverse {
    public static void rev(int n,int r){
        if(n==0){
            System.out.println(r);
            return;

        }
        rev(n/10,r*10+n%10);

    }
    public static void main(String[] args) {
        rev(- 1234,0);

    }
}
