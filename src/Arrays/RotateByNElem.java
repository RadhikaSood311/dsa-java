package Arrays;
import java.util.*;

public class RotateByNElem {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = n % arr.length;   // handles n > size

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}