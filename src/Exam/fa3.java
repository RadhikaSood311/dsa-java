package Exam;
import java.util.*;

public class fa3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]) count++;
//
//            }
//            if(count==1) System.out.print(arr[i]+" ");
//        }












//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int q = sc.nextInt();
//        for(int i=0;i<q;i++){
//            int el = sc.nextInt();
//            try{
//                System.out.println(arr[el]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Out of Bound");
//
//            }
//        }












//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int sum=0;
//        int[][] arr = new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int id = sc.nextInt();
//
//        for(int j=0;j<c;j++){
//            sum+=arr[id][j];
//
//
//        }
//        System.out.println(sum);










//        Scanner sc = new Scanner(System.in);
//        int r =sc.nextInt();
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int[][] t = new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                t[i][j]=arr[j][i];
//            }
//        }
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(t[i][j]+" ");
//            }
//            System.out.println();
//        }






//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int[][] t=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++) {
//                t[i][j] = arr[j][i];
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            for(int j=n-1;j>=0;j--){
//                System.out.print(t[i][j]+" ");
//            }
//            System.out.println();
//        }




        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;
        int e = sc.nextInt();
        for(int i=0;i<r;i++){
            sum+=arr[i][e];

        }
        System.out.println(sum);

        }

}
