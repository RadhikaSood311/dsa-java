package OOPS;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
        void print(){
            System.out.println(name+" "+rno+" "+marks);
        }
    }


    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0]=56;
        s1.marks[3]=53;
        s2.marks[1]=93;
        s1.print();
        s2.print();
    }
}
