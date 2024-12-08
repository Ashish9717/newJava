package OOPS;

public class HybridInheritance {
        Mammals M  = new Mammals();
         Dog dobby  = new Dog();
         Puppy P = new Puppy();
          
        
}

class Animal {
        void Sound() {
                System.out.println("Animal makes Sounds");
        }
}

class Mammals extends Animal {
        void Feed() {
                System.out.println("Mammals feed youngs");
        }
}

class Dog extends Mammals {
        void bark() {
                System.out.println("Dog Barks");
        }
}

class Puppy extends Dog {
        void play() {
                System.out.println("Puppy Plays");
        }
}
