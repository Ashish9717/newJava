package BitManiPulation;
import java.util.*;

public class DecimalToBinary {

        public static int Decimal_ToBinary(int x){
                int res = 0 ; 
                int pow = 0;
                while(x > 0){
                        int rem = x % 2;
                        res = res + (rem  * (int)Math.pow(10 , pow));
                        pow++;
                        x /= 2;
                }
                return res;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                System.out.print(Decimal_ToBinary(x));
                sc.close();

        }
        
}
