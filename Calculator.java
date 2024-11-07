import java.util.*;

public class Calculator {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                char Operator = sc.next().charAt(0);
                switch (Operator) {
                        case '+':
                                System.out.println(a + b);
                                break;
                        case '*':
                                System.out.println(a * b);
                                break;
                        case '/':
                                System.out.println(a / b);
                                break;
                        case '-':
                                System.out.println(a - b);
                                break;
                        case '%':
                                System.out.println(a % b);
                                break;

                }
                sc.close();
        }

}
