package Recurssion1;

public class PowerFunction {
        public static int Power(int x , int n){
                if( n== 0){
                        return 1;
                }
                int pow = Power(x, n/2);
                int Pro = pow * pow;
                if(n % 2 != 0){
                        Pro *= x ;
                }
                return Pro;
               
        }
        public static void main(String[] args) {
                int x = 2 , n = 10;
                System.out.println(Power(x, n));
        }
        
}
