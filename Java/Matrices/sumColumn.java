public class sumColumn{
    public void sum(int[][] matrix){
        for(int j = 0 ; j < matrix[0].length ; j++){
            int sum = 0;
            for(int i = 0 ; i< matrix.length ; i++){
                sum += matrix[i][j];

            }
            System.out.println(sum);
        }
    }
}