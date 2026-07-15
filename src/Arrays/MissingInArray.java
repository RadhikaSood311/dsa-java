package Arrays;
import java.util.*;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr={2,5,3,1,6,7,8};
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];

        }
        System.out.println(sum-sum2);

    }
}
