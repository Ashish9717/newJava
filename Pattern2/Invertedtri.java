package Pattern2;

import java.util.*;

public class Invertedtri {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int line = sc.nextInt();
                for (int i = 1; i <= line; i++) {
                        for (int j = 1; j <=  i + 1; j++) {
                                System.out.print(" ");
                        }
                        for(int k= 1 ; k<= line - i+1 ; k++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
                sc.close();
        }

}
