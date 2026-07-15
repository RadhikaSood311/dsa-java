package OOPS;
import java.util.*;
public class ComplexNumberClass {
    public static class ComplexNumber{
        int x;
        int y;
        int x2;
        int y2;
        ComplexNumber(int x,int y){
            this.x=x;
            this.y=y;
        }
        ComplexNumber(int x,int y,int x2,int y2){
            this.x=x;
            this.y=y;
            this.x2=x2;
            this.y2=y2;

        }
        void print(){
            if(y>=0) System.out.println(x+"+"+y+"i");
            else System.out.println(x+"-"+(-y)+"i");
        }
        void add1(){
            int newx=x+x2;
            int newy=y+y2;
            if(y>=0) System.out.println(newx+"+"+newy+"i");
            else System.out.println(newx+"-"+(newy)+"i");

        }
        void add(ComplexNumber z){
            this.x+=z.x;
            this.y+=z.y;
        }
        void multiply(ComplexNumber z){

            int real = x*z.x - y*z.y;
            int imag = x*z.y + y*z.x;

            x = real;
            y = imag;
        }



        }
    public static void main(String[] args) {
        ComplexNumber C1 = new ComplexNumber(4,-8);
//        C1.print();
        ComplexNumber C2 = new ComplexNumber(4,-5,6,8);
//        C2.add1();
        ComplexNumber C3 = new ComplexNumber(1,2);
        C1.print();
//        C1.add(C3);
//        C1.print();
        C1.multiply(C3);
        C1.print();

    }
}
