package Array2D;

public class SearchIn2DArray {
        public static void Search_IN_2DArray(int matrix[][] , int target){
                int n = matrix.length , m = matrix[0].length;
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0; j <  m ; j++){
                           if(matrix[i][j] == target){
                                System.out.print(i + " , " + j);
                           }
                        }
                        System.out.println();
                }
                System.out.println("target not found");
        }
        public static void main(String[] args) {
                int [][] matrix = {{2,4,1}, {1,3,4},{7,8,9}};
                int target = 9;
                Search_IN_2DArray(matrix, target);
        }
        
}
