package Strings;
import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Raghav");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'g');
        System.out.println(s);


//        default 16 hoti h capacity imports tk pohuncne ke bad current*2+2,..or jo lenghth tum dalogi vo bnhaega capacoty agar words daloge to uski length + 16 bnjaegi

    }
}
