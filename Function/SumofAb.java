package Function;

import java.util.*;

public class SumofAb {
        public static int CalculateSum(int a, int b) { // Parameter or formal parameter
                int Sum = 0;
                Sum = a + b;
                return Sum;
        }

        
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int Sum = CalculateSum(a, b); // Arguments or actual parameter
                System.out.println("Sum is :" +Sum);
                sc.close();
        }

}
