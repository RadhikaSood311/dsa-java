package Arrays;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,67,54,32,6};
        int temp=0;
        int i=0,j=arr.length-1;
//        for(int i=0;i<arr.length/2;i++){
//            temp = arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        }




    }
}
