package Arrays;
import java.util.*;

public class Sumofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.println("Enter  no of elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);



    }
}
