package Function3;
import java.util.*;
public class HollowRec {
        public static void Hollow_Rectangle(int Row , int Col){
                for(int  i = 1; i<= Row ; i++){
                        for(int j = 1 ; j<= Col ;j++){
                                if(i == 1 || j == 1 || i == Row || j == Col){
                                        System.out.print("*");
                                }else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                }
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int Row = sc.nextInt();
                int Col = sc.nextInt();
                Hollow_Rectangle(Row, Col);
                sc.close();
        }
        
}
