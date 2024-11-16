package Array1;
// import java.util.*;

public class LinearSearch {
        public static int Linear_search(int num[] , int target){
                int size = num.length;
                for(int i = 1 ; i< size ;i++){
                        if(num[i] == target){
                                return i;
                        }
                }
                return -1;
        }
        public static void main(String[] args) {
              int num [] = {1,34,5,23,4,6,2,8,10,11,14};
              int target = 10;
             int index = Linear_search(num, target);
             if(index == -1){
                System.out.println("Target not Found");
             }else{
                System.out.println("Target is at inedx   : " + index);
             }
        }
        
}
