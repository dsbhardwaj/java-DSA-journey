public class identity{
    public boolean isIdentity(int[][] matrix){
        boolean ans = true ;
         if(matrix.length != matrix[0].length){
            return false ;
         }
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j= 0 ; j < matrix[i].length ; j++){
                 
                 if(matrix[i][j] != 1 && i==j){
                    return false ;}

                    if(matrix[i][j] != 0 && i != j){
                        return false ;
                    }

                 }
                    
                 }
            
            return ans ;
        }
    }
