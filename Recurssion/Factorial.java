package Recurssion;

public class Factorial {
        public static int Factorial_OfNumber(int num){
                if(num ==0){
                        return 1;
                }
                
                int fnm1=  Factorial_OfNumber(num -1);
                int fn = num * fnm1;
                return fn;
        }
        public static void main(String[] args) {
                int num = 5;
                System.out.println(Factorial_OfNumber(num));
        }
        
}
