import java.util.*;
public class Maxarray{
  public static void main(String[] args){
    System.out.println("enter the size of array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements of array");  
    for(int i = 0; i<n ; i++){
    
      arr[i] = sc.nextInt();

    }
      int max = arr[0];
      for( int i = 0 ; i<n; i++){
        if(arr[i]> max){
          max = arr[i];
        }
      }
    System.out.println("the maximum element of an array is :" + max);
  }
}