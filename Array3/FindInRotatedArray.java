package Array3;

public class FindInRotatedArray {
        public static int FindElement_InRotatedArray(int num[] , int target){
                int n = num.length;
                int left = 0 , right = n - 1;
                while(left <= right){
                        int mid = left + (right - left) / 2 ; 
                        if(num[mid] == target){
                                return mid;
                        }else if( num[mid-1] > num[mid+1]  && target < num[mid] ) {
                                left = mid+1;
                        }else{
                                right = mid-1;
                        }
                }
                return -1;
        }
        public static void main(String[] args) {
                int num [] = {4,5,6,7,0,1,2};
                int target = 2;
                System.out.println(FindElement_InRotatedArray(num, target));
        }
        
}
