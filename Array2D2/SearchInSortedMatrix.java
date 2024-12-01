package Array2D2;

public class SearchInSortedMatrix {
        public static boolean Search_In_SortedMatrix(int [][] matrix, int target){
                int n = matrix.length , m = matrix[0].length;
                int row = 0 , col = m-1;
                while(row < n && col >= 0){
                        if(matrix[row][col] == target){
                                System.out.print("Target found at :" + row +"," + col);
                                return true ;
                        }else if(target < matrix[row][col]){
                                col--;
                        }else{
                                row++;
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
                Search_In_SortedMatrix(matrix, target);
        }
        
}
