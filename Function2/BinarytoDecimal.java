package Function2;

import java.util.*;

public class BinarytoDecimal {
        public static int BinToDecimal(int num) {
                int dec = 0;
                int pow = 0;
                while (num > 0) {
                        int ld = num % 10;
                        dec = dec + (ld * (int) Math.pow(2, pow));
                        pow++;
                        num /= 10;
                }

                return dec;

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(BinToDecimal(num));
                sc.close();
        }

}
