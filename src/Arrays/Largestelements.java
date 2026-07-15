package Arrays;
import java.util.*;

public class Largestelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxx = Integer.MIN_VALUE;
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i]>maxx){
                maxx= arr[i];

            }


        }
        System.out.println(maxx);



    }
}

