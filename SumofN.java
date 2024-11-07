import java.util.*;
public class SumofN {
        public static void main(String [] args){
                Scanner sc =  new Scanner (System.in);
                int n = sc.nextInt();
                int Sum = 0 , Counter = 0;
                while(Counter <= n){
                        Sum += Counter;
                        Counter++;    
                }
                System.out.print(Sum);
                sc.close();
        }
        
}
