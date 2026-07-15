package OOPS;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Akash";
        s1.rno=102;
        s1.cgpa=8.7;

        Student s2 = new Student();
        s2.name="Nikhil";
        s2.rno=51;
        s2.cgpa=8.4;


        Student s3 = new Student();
        s3.name="Natansh";
        s3.rno=41;
        s3.cgpa=8.1;


        Student s4 = new Student();
        s4.name="Radhika";
        s4.rno=64;
        s4.cgpa=9.1;


        System.out.println(s4.name + s4.cgpa + s2.name);
        s1.print();
        s2.print();
        s3.print();
    }
}
