package Function3;

import java.util.*;

public class SolidRombus {
        public static void RightRombus(int n) {
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i + 1; j++) {
                                System.out.print(" ");
                        }
                        for (int k = 1; k <= n; k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
               
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                RightRombus(n);
                sc.close();
        }

}
