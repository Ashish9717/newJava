package Function2;

import java.util.*;

public class CheckEven {
        public static boolean isEven(int num) {
                boolean isEven = true;
                if (num % 2 != 0) {
                        isEven = false;
                }
                return isEven;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(isEven(num));
                sc.close();
        }

}
