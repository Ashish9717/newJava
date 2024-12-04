package Strings2;

public class PrintLargestString {

        public static String Laregst_String(String fruit[]){
                String largest = fruit[0];
                for(int i = 1 ; i < fruit.length; i++){
                        if(largest.compareToIgnoreCase(fruit[i]) < 0){
                                largest = fruit[i];
                        }
                }
                return largest;
        }
        public static void main(String[] args) {
                String fruit[] = {"apple" ,"Mango" , "Banana"};
                System.out.println(Laregst_String(fruit));
        }
        
}
