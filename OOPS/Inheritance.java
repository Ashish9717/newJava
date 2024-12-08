package OOPS;

public class Inheritance {
        public static void main(String[] args) {
               Dog dobby= new Dog();
               dobby.eat();
               dobby.breath();
               dobby.legs = 4;
               dobby.Bark();
        }
        
}
//Base class
class Animal{
        void eat(){
                System.out.println("Eats");
        }
        void breath(){
                System.out.println("Breaths");
        }
}
class Mammals extends Animal{
        int legs;
}
class Dog extends Mammals{
        void Bark(){
                System.out.println("Dog Barks");
        }
}
// Derived class
// class Fish extends Animal{
//         int fins;
//         void swim(){
//                 System.out.println("Swim");
//         }
// }
