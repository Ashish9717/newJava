package Recurssion;

public class PrintNumberInDecreasing {
      public static void Print_Reverse_Number(int n){
        if(n==1){
                System.out.println(n);
                return;
        }
          System.out.print(n+" ");
          Print_Reverse_Number(n-1);
      }  
      public static void main(String[] args) {
        int n = 10; 
        Print_Reverse_Number(n);

      }     
}
