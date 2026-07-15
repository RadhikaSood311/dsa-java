package OOPS;


public class Constructor {
    public static class Car{
        int seats;
        String name;
        double length;
        Car(String name,int seats){
            this.name=name;
            this.seats=seats;

        }
        Car(int x,String s,double d){
            seats=x;
            name = s;
            length= d;
        }
        void print(){
            double length = 3894;
            System.out.println(seats+" "+name+" "+this.length);

        }

    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia Sonet",3.99);
        c1.print();
        Car c2 = new Car("Lord Alto",6);
        c2.print();
//        Car c3 = new Car();
//        c3.name="nexon";
//        c3.print();
    }
}
