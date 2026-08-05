import java.util.ArrayList;
import java.util.List;
public class wave{
    public List<Integer> waveTraversal(int[][] matrix){
        List<Integer> ans = new ArrayList<>();

        for(int j = 0 ; j < matrix[0].length ; j++){
            if(j%2 == 0){
                for(int i = 0 ; i < matrix.length ; i++){
                    ans.add(matrix[i][j]);
                }
            }else{
                for(int i = matrix.length -1 ; i >= 0 ; i--){
                    ans.add(matrix[i][j]);
                }
            }
        
        }
        return ans ;
    }
}