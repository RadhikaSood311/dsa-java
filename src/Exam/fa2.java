package Exam;
import java.sql.SQLOutput;
import java.util.*;
public class fa2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        int b = sc.nextInt();
//        int s=0;
//        int sum = 0;
//        for(int i=0;i<b;i++){
//            int d = sc.nextInt();
//            sum+=d;
//        }
//        int f = sc.nextInt();
//        for(int i=1;i<=b;i++){
//            s += f*i;
//
//
//        }
//        if(sum-s<=0) System.out.print(false);
//        else System.out.println(true);













//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        int positive=0;
//        int negative=0;
//        int even=0;
//        int odd=0;
//        for(int i=0;i<10;i++){
//            arr[i]=sc.nextInt();
//            if(arr[i]>0) positive++;
//            if(arr[i]<0) negative++;
//            if(arr[i]%2==0) even++;
//            if(arr[i]%2!=0) odd++;
//        }
//        System.out.println(positive);
//        System.out.println(negative);
//        System.out.println(even);
//        System.out.println(odd);














        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count1=0;
            int count2=0;
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]) {
                    if (arr1[i] == arr1[j]) count1++;
                    if (arr1[i] == arr2[j]) count2++;
                }



            }
            if(count1!=count2){
                System.out.println(0);
                return;
            }

        }
        System.out.println(1);



















//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int[] arr = new int[n];
//
//        int count=0;
//for(int i=0;i<n;i++){
//    arr[i]=sc.nextInt();
//}
//for(int i=0;i<n;i++){
//    boolean found=true;
//
//    for(int j=i+1;j<n;j++){
//        if(arr[i]<arr[j]){
//            found=false;
//            break;
//        }
//    }
//    if(found) count++;
//
//}
//        System.out.println(count);
//

















//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            int count = 0;
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]) count++;
//
//            }
//            if(count>n/2) {
//                System.out.println(arr[i]);
//                return;
//            };
//        }
//        System.out.println(-1);






























//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[] arr1 = new int[m];
//        int[] arr2 = new int[n];
//        int sum1=0;
//        int sum2=0;
//        for(int i=0;i<m;i++){
//            arr1[i]=sc.nextInt();
//            sum1+=arr1[i];
//        }
//        for(int i=0;i<n;i++){
//            arr2[i]=sc.nextInt();
//            sum2+=arr2[i];
//        }
//        System.out.println(sum1-sum2);



















//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        int[][] arr = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//                if(i==j) sum+=arr[i][j];
//            }
//        }
//        System.out.println(sum);










//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        int sum=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//                if(i+j==n-1) sum+=arr[i][j];
//            }
//        }
//        System.out.println(sum);













//        Scanner sc = new Scanner(System.in);
//        int r1 = sc.nextInt();
//        int c1 = sc.nextInt();
//        int arr1[][] = new int[r1][c1];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                arr1[i][j]=sc.nextInt();
//            }
//        }
//        int r2 = sc.nextInt();
//        int c2 = sc.nextInt();
//        int arr2[][] = new int[r2][c2];
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                arr2[i][j]=sc.nextInt();
//            }
//        }
//        int[][] c=new int[r1][c2];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c2;j++){
//                for(int k=0;k<c1;k++){
//                    c[i][j]+=arr1[i][k]*arr2[k][j];
//                }
//            }
//        }
//
//        for(int i=0;i<r1;i++) {
//            for (int j = 0; j < c2; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }




















//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        boolean found = true;
//        int[][] arr = new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int[][] arr2 = new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                if(arr[i][j] != arr2[i][j]){
//                    found = false;
//                    break;
//
//                }
//            }
//        }
//        if(found){
//            for(int i=0;i<r;i++){
//                for(int j=0;j<c;j++){
//                    System.out.print(arr[i][j]+arr2[i][j]+" ");
//                }
//                System.out.println();
//            }
//
//        }
//        else{
//            for(int i=0;i<r;i++){
//                for(int j=0;j<c;j++){
//                    System.out.print(arr[i][j]-arr2[i][j]+" ");
//                }
//                System.out.println();
//            }
//
//        }






















        }
    }

