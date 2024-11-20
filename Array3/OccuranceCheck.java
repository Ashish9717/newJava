package Array3;

public class OccuranceCheck {
        public static boolean Check_TwiceOccurance(int num[]){
                int n = num.length;
                // boolean IsPresent = true;
                for(int i = 0 ; i< n ; i++){
                        for(int j = i+1 ; j< n ;j++){
                                if(num[i] == num[j]){
                                        return true;
                                }
                        }
                }
                return false;
        }
        public static void main(String[] args) {
                int num[] = {1,2,3,1};
                System.out.println(Check_TwiceOccurance(num));
        }
        
}
