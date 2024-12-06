package BitManiPulation;

import java.util.Scanner;

public class CheckPowerOfTwo {
        public static boolean Check_PowerOf_Two(int num){
                while(num >  0){
                    if((num & (num-1) )== 0){
                        System.out.println("The Given number is Power of Two");
                        return true ;
                    }
                }
                System.out.println("Not a power");
                return false;
                
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(Check_PowerOf_Two(num));
                sc.close();
        }
        
}
