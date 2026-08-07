public class saddlePoint {

    public void findSaddlePoint(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            int min = matrix[i][0];
            int minCol = 0;

            // Find the minimum element in the current row
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            // Check whether it is the maximum in its column
            boolean isSaddle = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point: " + min);
                return;
            }
        }

        System.out.println("No Saddle Point Found");
    }
}