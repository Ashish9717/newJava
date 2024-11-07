import java.util.*;
public class PosiNegi {
        public static void main (String [] args){
                Scanner sc = new Scanner (System.in);
                int x = sc.nextInt();
                if(x >= 0){
                        System.out.println("Number is positive");
                }else{
                        System.out.println("Number is negitive");
                }
                sc.close();
        }
        
}
