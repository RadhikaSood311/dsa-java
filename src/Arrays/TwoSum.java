package Arrays;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        int sum=2;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("The sum of these "+arr[i]+" "+arr[j]+" is 2");
                }
            }
        }
    }
}
