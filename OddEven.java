import java.util.*;
public class OddEven {
        public static void main (String [] args){
                Scanner sc = new Scanner (System.in);
                int Num = sc.nextInt();
                if(Num % 2 == 0){
                        System.out.println("Given number is Even");
                }else{
                        System.out.println("Given number is Odd");
                }
                sc.close();
        }
        
}
