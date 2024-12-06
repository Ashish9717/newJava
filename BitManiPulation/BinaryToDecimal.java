package BitManiPulation;
import java.util.*;

public class BinaryToDecimal {

        public static int Binary_ToDecimal(int x){
                int res = 0;
                int pow = 0 ; 
                while(x > 0){
                       int  rem = x %10; 
                       res = res + (rem * (int) Math.pow(2,pow));
                       pow++;
                       x /= 10;
                }
                return res;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x= sc.nextInt();
                System.out.println(Binary_ToDecimal(x));
                sc.close();
        }
        
}
