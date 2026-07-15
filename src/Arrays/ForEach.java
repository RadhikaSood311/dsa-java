package Arrays;
import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        int[] arr = {4,5,2,14,6,7};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
//        for(int ele:arr){
//            ele*=2;
//        }
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

}
