package Function2;

import java.util.*;

public class Binomail {
        public static int Factorial(int n) {
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                        fact *= i;

                }
                return fact;
        }

        public static int BinomialCoefficient(int n, int r) {
                int n_fact = Factorial(n);
                int r_fact = Factorial(r);
                int a = Factorial(n - r);

                int ans = n_fact / (r_fact * a);
                return ans;

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int r = sc.nextInt();

                System.out.println(BinomialCoefficient(n, r));
                sc.close();
        }

}
