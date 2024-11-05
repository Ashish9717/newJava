import java.util.*;
public class IncomeTax {
        public static void main (String [] args){
                Scanner sc = new Scanner (System.in);
                int Income = sc.nextInt();
                double tax = 0;
                
                if(Income < 500000){
                   System.out.println("No Tax");
                }else if(Income >= 500000 && Income < 1000000){
                        tax = Income * (0.2);
                        System.out.println("Given Tax :" + tax);
                }else{
                        tax = Income * 0.3 ;
                        System.out.println("Given Tax :" + tax);
                }
                sc.close();
        }
        
}
