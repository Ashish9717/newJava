package BitManiPulation;

public class ClearIBits {
        public static int Claer_I_Bits(int num , int i){
                int bitmask = (~0)<<i;
                return num & bitmask;
        }
        public static void main(String[] args) {
                int num = 10 , i= 2;

                System.out.println(Claer_I_Bits(num, i));
        }
        
}
