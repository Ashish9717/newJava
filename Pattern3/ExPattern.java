package Pattern3;

import java.util.*;

public class ExPattern {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int line = sc.nextInt();
                for (int i = 1; i <= line; i++) {
                        for (int j = 1; j <= line; j++) {
                                if (i - j == 0 || i + j == line+1) {
                                        System.out.print("*");
                                } else {
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                }
                sc.close();

        }
}
