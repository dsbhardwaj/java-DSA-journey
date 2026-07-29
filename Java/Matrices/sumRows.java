public class sumRows{
    public void sum(int[][] matrix ){
        for(int i = 0 ; i < matrix.length ; i++){
            int sum = 0 ;
            for(int j = 0 ; j < matrix[i].length ; j++){
                sum += matrix[i][j];
            }
                System.out.println(sum);
            }
        
    
    }
}