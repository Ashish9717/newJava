package Function3;

import java.util.*;

public class RightHalfPrimid {
        public static void Inverted_halfPramid(int row, int col) {
                for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= col - i ; j++) {
                                System.out.print(" ");

                        }
                        for (int k = 1; k <= i; k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                int col = sc.nextInt();
                Inverted_halfPramid(row, col);
                sc.close();
        }

}
