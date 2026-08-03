public class rotationClockwise{
    public void rotation(int[][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i+1 ; j < matrix[i].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }
        for(int i = 0 ; i < matrix.length ; i++){
                int start = 0;
                int end = matrix[i].length - 1 ;
                while(start < end){
                    int temp = matrix[i][start] ;
                    matrix[i][start] = matrix[i][end] ;
                    matrix[i][end] = temp ;

                    start++;
                    end -- ;
                }
                for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }

    }
}