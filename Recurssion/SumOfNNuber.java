package Recurssion;

public class SumOfNNuber {
        public static int Sum_OfNNumber(int n){
                if(n==0){
                        return 0;
                }
                int sum = n + Sum_OfNNumber(n-1);
                return sum;
        }
        public static void main(String[] args) {
                int n = 10 ;
                System.out.println(Sum_OfNNumber(n));
        }
        
}
