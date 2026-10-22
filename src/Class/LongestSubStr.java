package Class;
import java.util.*;

public class LongestSubStr {
    public static void main(String[] args) {
        String s="abcabaca";
        int ans = LongestLen(s);
        System.out.println("Longest Length:" + ans);


    }
    public static int LongestLen(String s){
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;

    }
}
