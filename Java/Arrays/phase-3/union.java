import java.util.ArrayList;
import java.util.Scanner;
public class union{
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

     //UNION

     ArrayList<Integer> union = new ArrayList<>();
    int i = 0;
    int j = 0;
    while(i < A.length && j < B.length){
     if(A[i] < B[j]){
        union.add(A[i]);
        i++;
     }else if(A[i] > B[j]){
        union.add(B[j]);
        j++;
     }else if(A[i] == B[j]){
        union.add(A[i]);
        i++;
        j++;
     }  
    
    }

    while(i < A.length){
      union.add(A[i]);
      i++;
    }
    while(j < B.length){
      union.add(B[j]);
    }
     System.out.print(union);

    }
}

 
