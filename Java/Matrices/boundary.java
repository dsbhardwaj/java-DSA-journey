import java.util.ArrayList;
import java.util.List;

public class boundary{
    public List<Integer> boundaryTraversal(int[][] matrix){

        List<Integer> ans = new ArrayList<>();
        int top = 0 ;
        int bottom = matrix.length -1 ;
        int left = 0 ; 
        int right = matrix[0].length - 1;

             
            for(int j = left ; j <= right ; j++){
                ans.add(matrix[top][j]);
            }

            for(int i = top + 1 ; i <= bottom ; i++){
                ans.add(matrix[i][right]);
            }

            for(int j = right - 1 ; j >= left ; j--){
                ans.add(matrix[bottom][j]);
            }

            for(int i = bottom - 1 ; i > top ; i--){
                ans.add(matrix[i][left]);
            }
        
        return ans ;
    }
}