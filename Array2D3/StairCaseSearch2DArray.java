package Array2D3;

public class StairCaseSearch2DArray {
        public static boolean StairCase_In2DArray(int[][] matrix , int target){
                int n = matrix.length , m = matrix[0].length;
                int row = 0  , col = m - 1;
                while(row < n && col >= 0){
                        if(matrix[row][col] == target){
                                System.out.print("Target found at :" + row +"," + col);
                                return true;
                        }else if (matrix[row][col] < target){
                                row++;
                        }else{
                                col--;
                        }
                }
                return false;
        }
        public static void main(String[] args) {
                int [][] matrix = {{10,20,30,40},
                                   {15,25,35,45},
                                   {27,29,37,48},
                                   {32,33,39,50}};
                int target = 33;
                StairCase_In2DArray(matrix, target);  
        }
        
        
}
