package Function;
import java.util.*;

public class ProductAb {
        public static int Product(int a , int b){
                int prod = a * b;
                return prod;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a =  sc.nextInt();
                int b  = sc.nextInt();
               int Ans = Product(a,b);
               System.out.println("Product is :" + Ans);
                sc.close();
        }
        
}
