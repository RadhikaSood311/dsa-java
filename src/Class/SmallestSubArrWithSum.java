package Class;
import java.util.*;

public class SmallestSubArrWithSum {
    public static int SmallestSubArr(int[]arr,int k){
        int left=0;
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<arr.length;right++) {
            sum += arr[right];
            while (sum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                    sum -= arr[left];
                    left++;
                }
            }
            if (minLength == Integer.MAX_VALUE)
                return 0;
            return minLength;
        }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,5,6,3};
        int k=7;
        System.out.println(SmallestSubArr(arr,k));

    }
}
