public class saddlePoint{
    public void isSaddle(int[][] matrix){
            int mincolm = 0 ;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                  int min = matrix[0][0];
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    mincolm = j ;
                }
                    int max = matrix[0][0];

                    for(int n = j ; n < matrix[0].length ; n++){
                        for(int m = 0 ; m < matrix.length ; m++){
                            if(matrix[m][n] > max){
                                max = matrix[m][n];
                            }

                        }
                    }

                    if(min == max){
                        System.out.println( matrix[i][j]);
                    }
                }
            }
        }
    }
