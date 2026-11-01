public class multiplication{
    public int[][] multiply(int A[][] , int[][]B){
        if(A[0].length != B.length){
            throw new IllegalArgumentException("column of matrix A must be equal to row of matrix B");
        }
        int[][] result = new int[A.length][B[0].length];

        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < B[0].length ; j++){
                for(int k = 0 ; k<A[0].length ; k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}