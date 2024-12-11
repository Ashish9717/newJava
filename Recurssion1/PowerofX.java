package Recurssion1;

public class PowerofX {
        public static double PowerOf_x(double x , double n){
                if(n == 0){
                        return 1;
                }
                double xn = x * PowerOf_x(x, n-1);
                                return xn;
        }
        public static void main(String[] args) {
                int x = 2 , n =10;
                System.out.println(PowerOf_x(x, n));
        }
        
}
