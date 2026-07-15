package Exam;
import java.sql.SQLOutput;
import java.util.*;


public class fa1 {
    static void ReverseArray(int[]arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        boolean found = false;
//
//        for(int i = 0; i < n; i++){
//
//            int count = 0;
//
//            for(int j = 0; j < n; j++){
//
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//
//            if(count == 1){
//                System.out.println(arr[i]);
//                found = true;
//                break;
//            }
//        }
//
//        if(found == false){
//            System.out.println(-1);
//        }
//












//        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int e1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int e2 = sc.nextInt();
//        int num=0;
//
//        if(s2>e1 || e2<s1){
//            System.out.println("No intersection");
//        }
//        for(int i=s1;i<=e1;i++){
//            if(i==s2) num=i;
//
//        }
//        if(e1>=e2){
//            for(int i=num;i<=e2;i++){
//                System.out.print(i+" ");
//            }
//        }
//        if(e2>e1){
//            for(int i=num;i<=e1;i++){
//                System.out.print(i+" ");
//            }
//        }




//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        while(t-- > 0){
//            long n = sc.nextLong();
//            long ans = (long)Math.sqrt(n);
//            System.out.println(ans);
//        }
//










//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//
//        for(int i=0;i<n;i++){
//            System.out.print(a);
//            int c = a + b;
//            a = b;
//            b = c;
//
//        }















//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int sum=0;
//        while(t-->0){
//            int min = sc.nextInt();
//            int max = sc.nextInt();
//            if(min>max) System.out.println("0");
//            for(int i=min;i<=max;i++){
//                sum+=i;
//            }
//            System.out.print(sum);













//        Scanner sc = new Scanner(System.in);
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        int count =0;
//        for(int i=start;i<=end;i++){
//            String var = String.valueOf(i);
//            String rev = new StringBuilder(var).reverse().toString();
//            if(var.equals(rev)){
//                count++;
//
//            }
//
//        }
//        System.out.print(count);




//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] notes={2000,500,100,50,20,10,5,2,1};
//        for(int i=0;i<notes.length;i++){
//            int count = n/notes[i];
//            System.out.print(count);
//            n=n%notes[i];
//
//            if(i!=notes.length-1){
//                System.out.print(" ");
//            }
//        }






//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = Integer.toBinaryString(n);
//        System.out.print(s);







//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        if((n%4==0 && n%100!=0) || n%400==0){
//            System.out.println("Leap Year");
//
//
//        }
//        else{
//            System.out.println("Not a Leap Year");
//        }









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
//        int n = sc.nextInt();
//        int num=1;
//        for(int i=1;i<=n;i++){
//            for(int j=i;j<num+i;j++){
//                System.out.print(j+" ");
//
//            }
//            num++;
//            System.out.println();
//        }


















//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int r = sc.nextInt();
//        int start = 0;
//        int end = r-1;
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        start=r;
//        end=n-1;
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        start=0;
//        end=n-1;
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }












        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ReverseArray(arr,0,n-1);
        ReverseArray(arr,0,r-1);
        ReverseArray(arr,r,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }






    }
        }

