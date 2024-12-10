package Recurssion;

public class NthFibonacciNumber {
        public static int Fibonacci_Number(int n){
                if(n == 0 || n==1){
                      return n;
                }
                int fnm1 = Fibonacci_Number(n-1);
                int fnm2 = Fibonacci_Number(n-2);
                int fn = fnm1 + fnm2;
                return fn;
        }
        public static void main(String[] args) {
                int n = 25;
                System.out.println(Fibonacci_Number(n));
        }
        
}
