package Pattern3;

import java.util.*;

public class RightRombus {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int line = sc.nextInt();
                for (int i = 1; i <= line; i++) {
                        for (int j = 1; j <= line - i; j++) {
                                System.out.print(" ");
                        }
                        for (int k = 1; k <= line; k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                sc.close();
        }

}
