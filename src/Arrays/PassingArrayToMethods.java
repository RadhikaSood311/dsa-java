package Arrays;
import java.sql.SQLOutput;
import java.util.*;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        change(x);
        System.out.println(x[2]);

    }

    public static void change(int[] y) {
        y[2]=20;


    }
}
