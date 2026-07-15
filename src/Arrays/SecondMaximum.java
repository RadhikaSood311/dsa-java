package Arrays;
import java.util.*;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,-3,10};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]<=max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
