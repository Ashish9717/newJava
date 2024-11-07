import java.util.*;
public class Num1 {
        public static void main( String [] args){
                Scanner sc = new Scanner (System.in);

                int Num = sc.nextInt();
                int Num1 = 1;
                while(Num1 < Num){
                        System.out.println(Num1);
                        Num1++;
                }
                sc.close();
        }
        
}
