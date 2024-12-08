package OOPS;

public class ClassesAndObjects {
     public static void main(String[] args) {
        Pen p1 = new Pen(); // Create a pen Object P1;
        p1.Setcolor("Blue");
        System.out.println(p1.color);
        p1.SetTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
     }       
}
class Pen{
        // Properties and Functions
        String color;
        int tip;
        void Setcolor(String newColor){
                color = newColor;
        }
        void SetTip(int newTip){
                tip = newTip;
        }
} 
class Student{
        String name;
        int age ;
        float percentage;
        void CalculatePercentage(int phy , int chem , int math){
                percentage = (phy + chem + math) / 3;
        }
}
