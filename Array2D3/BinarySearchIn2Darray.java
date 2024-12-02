package Array2D3;

public class BinarySearchIn2Darray {
        public static boolean BinarySearch_In2DArray(int[][] matrix , int target){
                int n  = matrix.length , m = matrix[0].length;
                for(int r = 0 ; r < n ; r++){
                        int left = 0 , right = m-1;
                        while(left <= right){
                                int mid = left + (right - left) / 2;
                                if(matrix[r][mid] == target){
                                        return true;
                                }else if(matrix[r][mid] < target){
                                        left = mid +1;
                                }else{
                                        right = mid -1;
                                }
                        }
                }
                return false;
        }
        public static void main(String[] args) {
                int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
                int target = 16;
                BinarySearch_In2DArray(matrix, target);
        }
        
}
