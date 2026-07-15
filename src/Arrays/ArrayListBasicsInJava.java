package Arrays;
import java.util.*;

public class ArrayListBasicsInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(45);
        arr.add(45);
        arr.add(56);

        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr);
        int n = arr.size();
//        for(int i=0;i<n;i++){
//            System.out.print(arr.get(i)+" ");
//        }
//        for(int ele:arr) {
//            System.out.println(ele + " ");
//        }
        arr.add(78);
        arr.add(1,30);

        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

        int i=0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);


















    }
}
