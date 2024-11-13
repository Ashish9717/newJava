package Function2;

import java.util.*;

public class DecimaltoBinary {
        public static int DeciToBinary(int num) {
                int pow = 0;
                int BinNum = 0;
                while (num > 0) {
                        int rem = num % 2;
                        BinNum = BinNum + (rem * (int) Math.pow(10, pow));
                        pow++;
                        num /= 2;
                }
                return BinNum;

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(DeciToBinary(num));
                sc.close();

        }

}
