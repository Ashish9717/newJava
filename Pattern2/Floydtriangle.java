package Pattern2;
import java.util.*;

public class Floydtriangle {
        public static void main( String [] args){
                Scanner sc = new Scanner(System.in);
                int line = sc.nextInt();
                int num  = 1;
                for(int i = 1 ; i<=line ; i++){
                        for(int j = 1 ; j<= i ; j++){
                                System.out.print(num);
                                num++;
                        }
                        System.out.println();
                }
                sc.close();
        }
        
}
