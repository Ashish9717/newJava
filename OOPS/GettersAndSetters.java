package OOPS;

public class GettersAndSetters {
     public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.Setcolor("Yellow");
        System.out.println(p1.getColor()); 
     }
          
}
  class Pen{
      private String color;
     private int tip ;
     String getColor(){
          return this.color;
     }
     int getTip(){
        return this.tip;
     }
     void Setcolor(String newColor){
        this.color = newColor;

     }
     void setTip(int newTip){
        tip = newTip;
     }
}
