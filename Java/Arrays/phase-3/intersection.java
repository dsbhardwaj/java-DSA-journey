import java.util.ArrayList;
import java.util.Scanner;
public class intersection{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array A:");
    int n = sc.nextInt();
    int[] A = new int[n];
    System.out.println("Enter the element of array");
    for(int i = 0 ; i<n ; i++){
         A[i] = sc.nextInt();
    }  

    System.out.println("Enter the size of array B:") ;
    int m = sc.nextInt();
    int[] B = new int[m];
    System.out.println("Enter the Elements of array B");
    for(int j=0; j <m ; j++){
        B[j] = sc.nextInt();
    }

     //intersection

     ArrayList<Integer> Intersection = new ArrayList<>();
    int i = 0;
    int j = 0;
    while(i < A.length && j < B.length){
      if(A[i] < B[j]){
         i++;
      }else if(A[i] > B[j]){
         j++;
      }
      else{
        Intersection.add(A[i]);
        i++;
        j++;
     }  
    
    }
     System.out.print(Intersection);

    }
}

 
