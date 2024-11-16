package Array1;

public class BinarySearch {
        public static int Binary_search(int num[] , int target){
                int size= num.length;
                int start = 0 , end = size -1;
                while(start <= end){
                        int mid = (start + end) / 2;
                        if(num[mid] == target){
                                return mid ;
                        }
                        if(num[mid] < target){
                                start = mid + 1;

                        }else{
                                end = mid -1;
                        }
                }
                return -1;
        }
        public static void main(String[] args) {
                int num [] = {2,4,6,8,10,12,14};
                int target = 8;
                System.out.println("Target found at index : " +Binary_search(num, target));
        }
        
}
