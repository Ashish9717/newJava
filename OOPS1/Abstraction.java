package OOPS1;

public class Abstraction {
        public static void main(String[] args) {
                Horse h = new Horse();
                h.eat();
                h.walk();
                Chicken c = new Chicken();
                c.eat();
                c.walk();
        }

        
}

abstract class Animal{
        String color;
        Animal(){
            color = "brown";
        }
        void eat(){
                System.out.println("Animal eats");
        }
        abstract void walk();
}
class Horse extends Animal{
        Horse(){
                System.out.println("Horse Constructor called");
        }
        void  Changecolor(){
                color = "Derk Brown";
        }
        void walk(){
                System.out.println("Walks on 4 Legs");
        }
}
class Chicken extends Animal{
        void walk(){
                System.out.println("wlaks on 2 legs");
        }
}
