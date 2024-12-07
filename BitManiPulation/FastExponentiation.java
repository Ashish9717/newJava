package BitManiPulation;

public class FastExponentiation {

        public static int Fast_ExponentiaTion(int num , int pow){
                int ans = 1 ; 
                  while(pow > 0){
                        if((pow & 1) != 0){
                                ans *= num;
                        }
                        num = num*num;
                         pow = pow>>1;
                  }
                return ans ;
        }
        public static void main(String[] args) {
                int num = 2 , pow = 5;
                System.out.println(Fast_ExponentiaTion(num, pow));
        }
}