import java.util.*;
public class Reverse {
        public static void main (String [] args){
                Scanner sc = new Scanner (System.in);
                
                
                int Num = sc.nextInt();
                while(Num > 0){
                        int last = Num % 10;
                 System.out.print(last + " ");
                        Num /= 10;
                }
                sc.close();
                

        }
        
}
