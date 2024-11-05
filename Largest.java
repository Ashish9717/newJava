import java.util.*;
public class Largest {
        public static void main(String [] args){
                Scanner sc = new Scanner (System.in);

                int a = sc.nextInt() ;
                int b = sc.nextInt() ;
                if(a  >  b){
                        System.out.println("A is largest :" + a);
                }else{
                        System.out.println("B is largest : " + b);
                }
                sc.close();
        }
        
}
