import java.util.* ;
public class Fibonacci {
        public static void main( String [] args){
                Scanner sc = new Scanner(System.in);
                int Fib = sc.nextInt();
                int First = 0 , second = 1;
                for(int i = 2 ; i<= Fib ; i++){
                        i = First + second ;
                        First = second ;
                        second = i;

                }
                sc.close();
                
        }
        
}
