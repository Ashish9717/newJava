package Function2;

import java.util.*;

public class Average {
        public static int Avg(int a, int b, int c) {
                int ans = (a + b + c) / 3;
                return ans;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println(Avg(a, b, c));
                sc.close();
        }

}
