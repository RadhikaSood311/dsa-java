package Arrays;
import java.util.*;

public class AddingOneToArrayVector {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        for(int i = arr.size()-1;i>=0;i--){
            if(arr.get(i)<9){
                arr.set(i,arr.get(i)+1);
            }

            else{
                arr.set(i,0);
            }
        }
        arr.add(0,1);

        System.out.println(arr);



    }
}
