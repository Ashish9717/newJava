package Recurssion;

public class IncreasingNumber {
        public static void Print_Increasing_Number(int n){
                if(n==1){
                        System.out.print(n +" ");
                        return;
                }
                Print_Increasing_Number(n-1);
                System.out.print(n + " ");
        }
        public static void main(String[] args) {
                int n = 10;
                Print_Increasing_Number(n);
        }
        
}
