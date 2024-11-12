package Function;

import java.util.*;

public class Factorial {
        public static int Fact(int a) {
                int Ans = 1;
                for (int i = 1; i <= a; i++) {

                        Ans *= i;
                }
                return Ans;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                System.out.println(Fact(a));
                sc.close();
        }

}
