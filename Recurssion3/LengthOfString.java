package Recurssion3;

public class LengthOfString {
        public static int Lenght(String str ){
                if(str.length() == 0){
                        return 0;
                }
                return Lenght(str.substring(1)) +1;
        }
        public static void main(String[] args) {
                String str = "absbs";
                System.out.println(Lenght(str));
        }
        
}
