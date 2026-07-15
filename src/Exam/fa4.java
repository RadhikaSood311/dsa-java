package Exam;
import java.util.Scanner;

public class fa4 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }















//        Scanner sc = new Scanner(System.in);
//        int min = sc.nextInt();
//        int max = sc.nextInt();
//        int sum=0;
//
//        if(min>max) System.out.print("0");
//        for(int i=min;i<=max;i++){
//            sum+=i;
//
//        }
//        System.out.print(sum);




















//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n<=3) System.out.print(10);
//        if(n>=4 && n<=10) System.out.print(20);
//        if(n>10 && n<30) System.out.print(50);
//        else System.out.print("Membership cancelled");













//        Scanner sc = new Scanner(System.in);
//        int sal = sc.nextInt();
//        System.out.print(sal+sal/10+sal/5);








//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//        int f = sc.nextInt();
//
//        System.out.print(a+c+d+e+f+" "+(a+c+d+e+f)/5);










//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean found = false;
//        while(n>0){
//            if(n%2!=0) {
//                System.out.print("Not a power");
//                break;
//            }
//            n=n/2;
//            if(n==1){
//                System.out.print("Is a power of 2");
//                break;
//            }
//
//
//
//
//        }


















//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            long n = sc.nextLong();
//
//            long ans = n & (-n);
//
//            System.out.println(ans);
//        }
//






























//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int count=0;
//        for(int i=a;i<=b;i++){
//            String s = String.valueOf(i);
//            String rev = new StringBuilder(s).reverse().toString();
//
//            if(s.equals(rev)) count++;
//        }
//        System.out.print(count);













//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = String.valueOf(n);
//        String rev = new StringBuilder(s).reverse().toString();
//        System.out.print(rev);








//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = String.valueOf(n);
//        int sum=0;
//        for(int i=0;i<s.length();i++){
//            sum+=s.charAt(i)-'0';
//
//        }
//        System.out.print(sum);









//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = String.valueOf(n);
//        System.out.print(s.length());








        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int last = s.length()-1;
        int sum = (s.charAt(0)-'0')+(s.charAt(last)-'0');
        System.out.print(sum);


    }
}

