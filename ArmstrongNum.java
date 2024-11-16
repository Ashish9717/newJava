import java.util.*;
public class ArmstrongNum {
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your Number");
                 int Num = sc.nextInt();
                 int temp = Num ;
                 int armstrong = 0;
                 while(Num > 0){
                        int rem = Num % 10 ;
                        armstrong = armstrong + (int)Math.pow(rem , 3);
                        Num  /= 10;
                 }
                 if(temp == armstrong){
                        System.out.println("given number is armstrong");
                 }else{
                        System.out.println("given number is  not armstrong");
                 }
                  
                 sc.close();
        }
        
}
