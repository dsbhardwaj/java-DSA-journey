public class secondaryDiagonal{
    public void diagonal(int[][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
              int sum = matrix.length - 1 ;
              int j = sum - i ;
                if(i + j == sum){
                    System.out.println(matrix[i][j]);
                }
            }
        
    }
}