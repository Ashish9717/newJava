package OOPS1;

public class PolyMorPhism {
        public static void main(String[] args) {
                Calculator cal = new Calculator();
                System.out.println(cal.sum(1,2));
                System.out.println(cal.sum((float)1.5,(float)1.5));
                System.out.println(cal.sum(1,4,7));
                Dear d = new Dear();
                d.eat();
        }
        
}
// Method OverLoading Or Function OverLoading 

class Calculator{
        int sum(int a , int b){
                return a + b;
        }

        float sum(float a , float b){
                return a + b;
        }
         int sum(int a , int b , int c){
                return a + b + c;
         }
}
// Method Overriding or Function Overriding
class Animal{
        void eat(){
                System.out.println(" Animal eats");
        }
}
class Dear extends Animal{
        void eat(){
                System.out.println("Eats Grass");
        }
}