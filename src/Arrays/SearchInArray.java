package Arrays;
import java.util.*;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5,6};
//        boolean flag=false;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==n) {
//                flag=true;
//                break;
//            }
//
//        }
//        if(flag==true){
//            System.out.println("is present");
//        }else{
//            System.out.println("not present");
//        }

        int found = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n) {
                found = i;
                break;
            }
        }
        if(found!=-1) System.out.println("The number is present at index "+ found);
        else System.out.println("Number is not present");
    }
}
