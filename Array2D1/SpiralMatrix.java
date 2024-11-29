package Array2D1;

public class SpiralMatrix {
        public static void Spiral_Matrix(int matrix[][]){
                int  n = matrix.length , m = matrix[0].length;
                int StartRow = 0 , EndRow = n - 1;
                int StartCol = 0 ,  EndCol = m - 1;
                while(StartRow <= EndRow && StartCol <= EndCol){
                        // Top boundary
                        for(int j = StartCol ; j<= EndCol; j++ ){
                                if(StartRow == EndRow){
                                        break;
                                }
                                System.out.print(matrix[StartRow][j] +" ");
                        }
                        // right Boundary
                        for(int i = StartRow ; i<= EndRow ; i++){
                              System.out.print(matrix[i][EndCol]+ " ");
                        }
                        // Bootom boundary
                        for(int j = EndCol -1 ; j >=StartCol ; j-- ){
                                System.out.print(matrix[EndRow][j]+" ");
                        }
                        for(int i = EndRow -1 ; i>= StartRow+1;i--){
                                //Left boundary
                                if(StartCol == EndCol){
                                        break;
                                }
                         System.out.print(matrix[i][StartCol]+" ");
                        }
                        StartCol++;
                        StartRow++;
                        EndCol--;
                        EndRow--;
                }
                System.out.println();
        }
        public static void main(String[] args) {
                int [][] matrix = {{1,3,4} ,{3,7,8},{2,5,6}};
                Spiral_Matrix(matrix);
        }
        
}
