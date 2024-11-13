package Function2;

import java.util.*;

//Optimize code for Check  a number is prime or not.

public class Prime {
        public static Boolean isPrime(int a) {

                if(a ==2){
                        return true;
                }
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(a); i++) {
                        if (a % i == 0) {
                                isPrime = false;
                        }
                }
                return isPrime;

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                System.out.println(isPrime(a));
                sc.close();

        }

}
