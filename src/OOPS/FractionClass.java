package OOPS;

import javax.sql.rowset.FilteredRowSet;

class Fraction{
    int num;
    int den;
    Fraction(int num,int den){
        this.num=num;
        this.den=den;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction a){
        num = num*a.den+den*a.num;
        den*=a.den;
    }
    void divide(Fraction b){
        num*=b.den;
        den*=b.num;
    }
    void simplify(){
        boolean isNegative = (num*den < 0) ? true :false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        num/=gcd;
        den/=gcd;
        if(isNegative) num=-num;
    }
    int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction s = new Fraction(2,4);
        Fraction s1 = new Fraction(3,7);
        s.print();
//        s.add(s1);
//        s.print();
        s.divide(s1);
        s.simplify();
        s.print();
    }
}
