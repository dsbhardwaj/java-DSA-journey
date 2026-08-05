import java.util.ArrayList;
import java.util.List;
public class snakePattern{
        public List<Integer> snakeTraversal(int[][] matrix){
            List<Integer> ans = new ArrayList<>();

                for(int i = 0 ; i < matrix.length ; i++){
                    if(i%2 == 0){
                        for(int j= 0 ; j < matrix[i].length ; i++){
                            ans.add(matrix[i][j]);
                    }
                }else{for(int j = matrix[0].length ; j >= 0 ; j--){
                        ans.add(matrix[i][j]);
                    }
                }
                }
            return ans ;

        }
}