package BitManiPulation;

public class SwapTwoNumber {
        public static void main(String[] args) {
                int a = 10 , b = 7;
                 a = a^b;
                 b = a^b;
                 a = a^b;
                 System.out.println(a +"," +b);
        }
        
}
