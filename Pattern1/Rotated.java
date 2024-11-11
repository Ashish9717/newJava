import java.util.*;
public class Rotated {
        public static void main(String[] args) {
                Scanner sc = new Scanner ( System.in);

                System.out.println("Enter the number of lines");
                int line  = sc.nextInt();
                for(int i = 1; i<=line ; i++){
                        for(int j = 1 ; j<=line - i ; j++){
                                System.out.print(" ");

                        }
                        for(int k =1 ; k <=i ;k++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
                sc.close();
        }
        
}
