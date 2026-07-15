package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("grrrrrrr");
        }
    }
    public static class pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        pikachu p = new pikachu();

        d.speak();
        c.speak();
        p.speak();
    }

}
