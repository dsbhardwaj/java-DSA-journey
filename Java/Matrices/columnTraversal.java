import java.util.Scanner ;
public class columnTraversal{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] matrix = new int[m][n];
      for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; j < matrix[i].length ; j++){
            matrix[i][j] = sc.nextInt();       
             }
      }     
    int i = 0;
      for(int j = 0 ; j < matrix.length; j++){
        for( i = 0 ; i < matrix[i].length ; i++){
            System.out.print(matrix[i][j]);
        }
        System.out.println();
      } 
sc.close();
    }
}