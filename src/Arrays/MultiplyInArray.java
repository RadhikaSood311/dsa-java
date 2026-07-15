package Arrays;
import java.util.*;

public class MultiplyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
            System.out.println(arr[i]);

        }

    }
}
