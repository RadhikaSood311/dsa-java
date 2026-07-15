package Exam;
import java.util.*;

public class arrays {

    public static void main(String[] args){
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                     };
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//        }
//        System.out.println(sum);


//        int max= Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//
//        }
//        System.out.println(min);

//        float avg = 0;
//        for(int i=0;i<arr.length;i++){
//            avg+=arr[i];
//        }
//        System.out.println(avg/arr.length);


//        int even = 0;
//        int odd = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//        }
//        System.out.println("even count "+even+" ,odd count "+odd);


//        int temp=0;
//        for(int i=0;i<arr.length/2;i++){
//            temp = arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-i-1]=temp;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }

//        int[] arr2=new int[6];
//        for(int i=0;i<arr.length;i++){
//            arr2[i]=arr[i];
//
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr2[i]);
//        }

//        int target = 5;
//        int j=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                j=i;
//
//
//            }
//
//
//        }
//
//        if(j==-1){
//            System.out.println("invalid");
//        }
//        else{
//            System.out.println("word is at index " +j);
//        }
//        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int n = arr.length;
//        for(int i=1;i<3;i++){
//            int sum=0;
//            for(int j=0;j<i;j++){
////                if(i==j || i+j==n-1){
////                    System.out.print(arr[i][j]+" ");
////                }
//                System.out.print(arr[i][j]+" ");
////                sum+=arr[i][j];
//            }
        for(int i=0;i<3;i++){
            for(int j=2;j>i;j--){
                System.out.print(arr[i][j]+" ");
            }
//            System.out.println();
//            System.out.println(sum);
        }
//        System.out.print(sum);



    }
}
