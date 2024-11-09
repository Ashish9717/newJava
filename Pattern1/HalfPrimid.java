import java.util.*;
public class HalfPrimid {
        public static void main (String[] args){
                Scanner sc = new Scanner (System.in);
                int Line = sc.nextInt();
                for(int i = 1; i<=Line ;i++){
                        for(int j = 1 ;j<= i ; j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
                sc.close();
        }
        
}
