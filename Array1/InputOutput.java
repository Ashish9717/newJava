package Array1;
import java.util.*;

public class InputOutput {
        public static void main(String[] args) {
                int marks[] = new int[100];

                Scanner sc = new Scanner(System.in);

                //1 . taking input from user
                marks[0] = sc.nextInt(); //phy
                marks[1] = sc.nextInt(); //chem
                marks[2] = sc.nextInt(); //math

                //2 . Output 
                System.out.println("phy" + marks[0]);
                System.out.println("chem" + marks[1]);
                System.out.println("math" + marks[2]);

                //3 .updation
                // marks[2] = 100;
                // System.out.println("math : " + marks[2]);

                int percentage = (marks[0] +  marks[1] + marks[2]) /3;
                System.out.println("Percentage : " + percentage);
                sc.close();
        }
        
}
