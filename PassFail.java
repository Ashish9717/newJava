import java.util.*;
public class PassFail {
        public static void main (String [] args){
                Scanner sc = new Scanner ( System.in);
                int marks = sc.nextInt();

                String status  = marks >= 33?"pass" : "Fail" ;
                System.out.println(status);
                sc.close();
        }

        
}
