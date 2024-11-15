package Function3;
import java.util.*;
public class SumOfDigit {
        public static int DigitSum(int Num){
                int sum = 0 ;
                while(Num > 0){
                        int rem = Num % 10  ;
                        sum += rem ;
                        Num /= 10 ;
                }
                return sum;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner ( System.in);
                int Num = sc.nextInt();
                System.out.println(DigitSum(Num));
                sc.close();
        }
        
}
