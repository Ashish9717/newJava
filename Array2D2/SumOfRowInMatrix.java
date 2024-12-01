package Array2D2;

public class SumOfRowInMatrix {
        public static int Sum_ofRow(int[][] matrix){
               int n = matrix[0].length;
               int sum = 0;
               for(int j = 0 ; j < n ;j++){
                sum += matrix[1][j];
               }
               return sum;
        }
        public static void main(String[] args) {
                int[][] matrix = {{1,4,9},{11,4,3},{2,2,3}};
                System.out.println(Sum_ofRow(matrix));
        }
        
}
