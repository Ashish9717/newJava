package BitManiPulation;

public class ClearRangeOfBits {
        public static int Clear_RangeOf_Bits(int num ,int i , int j){
                int a = ((~0)<<(j+1));
                int b = (1<<i) - 1;
                int bitmask = a|b;
                return num & bitmask;
        }
        public static void main(String[] args) {
                int num  = 10 , i = 2 , j = 4;
                System.out.println(Clear_RangeOf_Bits(num, i, j));
        }
        
}
