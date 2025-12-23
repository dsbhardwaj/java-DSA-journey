import java.util.*;
public class SortedArray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");

    int n =  sc.nextInt();
    int[] arr = new int[n];
    
     for(int i = 0; i < n ; i++){
      arr[i] = sc.nextInt();
      }
      boolean isSorted = true;
      for(int i = 0; i <= n-2; i++){
        if(arr[i]>arr[i+1]){
          isSorted = false;
      }
      }
      if(isSorted){
       System.out.println("Array is sorted");
          }
         else{
            System.out.println("Array is unsorted");
          }
     }
  }
