package Recurssion2;

public class BinaryString {

        public static void Binary_String(String str ,int n , int lastPlace ){
                if(n == 0){
                        System.out.println(str);
                        return;
                }
                
                Binary_String(str+"0", n-1, 0);
                if(lastPlace == 0){
                        Binary_String(str+"1", n-1, 1);
                }
               
        }
        public static void main(String[] args) {
                int n = 3 , lastPlace = 0;
                Binary_String("", n, lastPlace);
        }
        
}
