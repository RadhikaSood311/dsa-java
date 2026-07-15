package Basic_cheeze;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        int start = Math.max(s1, s2);
        int end = Math.min(e1, e2);

        if (start > end) {
            System.out.println("No Intersection");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}