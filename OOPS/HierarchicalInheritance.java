package OOPS;

public class HierarchicalInheritance {
        public static void main(String[] args) {
                Mammals M = new Mammals();
                M.eat();
                M.walk();
                Fish Shark = new Fish();
                Shark.eat();
                Shark.Swim();
                Bird B = new Bird();
                B.eat();
                B.Fly();
        }
        
}
class Animal{
        void eat(){
                System.out.println("Animals Eat");
        }
}
class Mammals extends Animal{
        void walk(){
                System.out.println("Mamals Walk");
        }

}
class Fish extends Animal{
        void Swim(){
                System.out.println("Fish Swim");
        }
}
class Bird extends Animal{
        void Fly(){
                System.out.println("Birds Fly");
        }
}