package Reccursion;

public class hcf {
    public static int gcd(int s,int l){
        if(s==0) return l;
        return gcd(l%s,s);
    }
    public static void main(String[] args) {
//        int b=20;
//        int a=28 ;
//        int hcf=0;
//        if(b>a){
//            for(int i=1;i<=a;i++){
//                if(a%i==0 && b%i==0) hcf=i;
//            }
//        }
//        if(b<a){
//            for(int i=1;i<=b;i++){
//                if(a%i==0 && b%i==0) hcf=i;
//            }
//        }
//        System.out.println(hcf);
        System.out.println(gcd(3,2));
    }
}
