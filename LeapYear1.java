import java.util.*;
public class LeapYear1 {
        public static void main (String [] args){
                Scanner sc = new Scanner (System.in);
                System.out.println("Enter the year");
                int Year = sc.nextInt();
                if(Year % 4 == 0  && Year % 400 == 0){
                        System.out.println("Leap Year");
                }else{
                        System.out.println("Not Leap Year");
                }
                sc.close();

        }
        
}
