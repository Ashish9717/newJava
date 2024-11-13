package Function2;

import java.util.*;

public class PalindromeNum {
        public static int PalinDromeNumber(int Num) {
                int PalinDrome = 0;
                while (Num > 0) {
                        int rem = Num % 10;
                        PalinDrome = rem + (10 * PalinDrome);
                        Num /= 10;
                }
                return PalinDrome;

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int Num = sc.nextInt();
                int temp = Num;
                if (temp == PalinDromeNumber(Num)) {
                        System.out.println("Number is Palindrome");
                } else {
                        System.out.println("Number is not Palindrome");
                }
                sc.close();
        }

}
