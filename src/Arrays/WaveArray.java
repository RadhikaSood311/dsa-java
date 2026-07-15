package Arrays;
import java.util.*;


public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int i=0;
        int j=1;
        while(i<=arr.length-2){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
