public class addition {

    public int[][] add(int[][] A, int[][] B) {

        if (A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }
}