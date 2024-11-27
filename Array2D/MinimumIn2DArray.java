package Array2D;

public class MinimumIn2DArray {
        public static void Minimum_in2DArray(int matrix[][]){
                int n = matrix.length , m = matrix[0].length;
                int Minimum = Integer.MAX_VALUE;
                for(int i = 0 ; i < n ;i++){
                        for(int j = 0 ; j <m ; j++){
                                if(matrix[i][j] < Minimum){
                                        Minimum = matrix[i][j];
                                }
                        }
                }
                System.out.print("Minimum Element is :" + Minimum );
        }
        public static void main(String[] args) {
                int matrix[][] = {{2,1,3} ,{0,3,5}, { 2,5,8}};
                Minimum_in2DArray(matrix);
        }
        
}
