package Function2;

import java.util.*;

public class RangePrime {
        public static Boolean isPrime(int a) {

                if (a == 2) {
                        return true;
                }
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(a); i++) {
                        if (a % i == 0) {
                                isPrime = false;
                        }
                }
                return isPrime;

        }

        public static void PrimeRange(int a) {
                for (int i = 2; i <= a; i++) {
                        if (isPrime(i)) {
                                System.out.print(i + " ");
                        }
                }
                System.out.println();

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                PrimeRange(a);
                sc.close();
        }

}
