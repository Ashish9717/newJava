import java.util.*;
public class CharPattern {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                  System.out.println("Enter Number of lines ");
                int line = sc.nextInt();
                char ch ='A';
                for(int i = 1; i<=line ;i++){
                        for(int j= 1;j<=i ;j++){
                                System.out.print(ch);
                                ch++;
                        }
                        System.out.println();
                }
                sc.close();
        }
        
}
