package Arrays;
import java.util.*;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
//        int[] x = arr;
//        x[0]=100;
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0]=100;
        System.out.println(arr[0]);
    }
}
