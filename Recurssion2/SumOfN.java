package Recurssion2;

public class SumOfN {
        public static int Sum_oFN(int n){
                if(n== 0){
                        return 0;
                }
                int sum = n + Sum_oFN(n-1);
                return sum;
        }
        public static void main(String[] args) {
                int n = 3 ;
                System.out.println(Sum_oFN(n));
        }
        
}
