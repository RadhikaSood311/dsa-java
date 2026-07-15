import java.util.*;
public class exam {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String rev = "";
//        for(int i=s.length()-1;i>=0;i--){
//            rev=rev+s.charAt(i);
//        }
//        System.out.println(rev);

//        Scanner sc = new Scanner(System.in);
//        String m =  sc.nextLine();
//        String rev = "";
//        for(int i=m.length()-1;i>=0;i--){
//            rev = rev+m.charAt(i);
//        }
//        System.out.println(rev);
//        System.out.println(m);

//        if(m.equals(rev)) System.out.println("palindrome");
//        else System.out.println("not palindrome");
//        Scanner sc = new Scanner(System.in);
//        String m = sc.nextLine();
//        int count = 0;
//        for(int i=0;i<m.length();i++){
//            if(m.charAt(i)=='a' || m.charAt(i)=='e' || m.charAt(i)=='i' || m.charAt(i)=='o' || m.charAt(i)=='u'){
//                count++;
//            }
//
//        }
//        System.out.print(count);
//        String arr[] = m.split(" ");
//        System.out.println(arr.length);
//        int count = 0;
//        for(int i=0;i<m.length();i++){
//            if(m.charAt(i)==' '){
//                count++;
//            }
//
//        }
//        System.out.println(count+1);

//        m = m.replace(" ","");
//        System.out.println(m);

//        String s="banana";
//        int[] freq=new int[256];
//        for(int i=0;i<s.length();i++){
//            freq[s.charAt(i)]++;
//        }
//        for(int i=0;i<256;i++) {
//            if(freq[i]>0){
//                System.out.println((char)i +"=="+ freq[i]);
//        }
//    }


//        String a="cat";
//        String b="act";
//        char[] x=a.toCharArray();
//        char[] y=b.toCharArray();
//
//        Arrays.sort(x);
//        Arrays.sort(y);
//
//
//
//        System.out.println(Arrays.equals(x,y));



//        Scanner sc = new Scanner(System.in);
//
//        String pass = sc.nextLine();
//
//        boolean capital = false;
//        boolean small = false;
//        boolean number = false;
//
//        if(pass.length() < 8) {
//            System.out.println("Invalid");
//            return;
//        }
//
//        for(int i = 0; i < pass.length(); i++) {
//
//            char ch = pass.charAt(i);
//
//            if(ch >= 'A' && ch <= 'Z') {
//                capital = true;
//            }
//
//            else if(ch >= 'a' && ch <= 'z') {
//                small = true;
//            }
//
//            else if(ch >= '0' && ch <= '9') {
//                number = true;
//            }
//        }
//
//        if(capital && small && number)
//            System.out.println("Valid");
//
//        else
//            System.out.println("Invalid");


        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        boolean capital = false;
        boolean small = false;
        boolean number = false;

        if (pass.length()<8) {
            System.out.println("password not valid");
            return;
        }

        for(int i=0;i<pass.length();i++){
            char ch = pass.charAt(i);
            if(ch>='A' && ch<='Z' ){
                 capital = true;
            }
            else if(ch>='a' && ch<='z'){
                small=true;
            }
            else if(ch>='0' && ch<='9'){
                number=true;
            }
        }

        if(capital && small && number) System.out.println("valid");
        else System.out.println("invalid");


    }
}



