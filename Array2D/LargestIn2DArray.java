package Array2D;

public class LargestIn2DArray {
        public static void Largest_Num(int matrix[][]){
                int n= matrix.length , m = matrix[0].length;
                int largest = Integer.MIN_VALUE;
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j <m ; j++){
                                if(matrix[i][j] > largest){
                                        largest = matrix[i][j];
                                }
                        }                        
                }
                System.out.print("largest Number is " + largest );
        }
        public static void main(String[] args) {
                int[][] matrix = {{1,3,4} , {8,9,19},{5,67,7}};
                Largest_Num(matrix);
        }
        
}
