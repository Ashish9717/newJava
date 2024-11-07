import java.util.*;
public class Reverse1 {
        public static void main(String [] args){
                Scanner sc = new Scanner ( System.in);
                  int rev = 0;
                int Num = sc.nextInt();
                while(Num > 0){
                        int last = Num % 10;
                        rev = (rev * 10) + last;
                        Num /= 10;
                }
                System.out.println(rev);
                sc.close();
        }
        
}
