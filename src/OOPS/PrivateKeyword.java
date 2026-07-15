package OOPS;
class Students{
    String name="Hemant";
    private int rno=87;
    double cgpa=9.05;
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getRno(){
        return rno;
    }
    void setRno(int n){
        rno=n;
    }
}

public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa=8.9;
        s1.name="Radha";
        s1.print();
        s1.setRno(64);
        System.out.println(s1.getRno());






    }
}
