import java.util.*;
public class allNegativeNumberstoLeft{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array:");
    int n = sc.nextInt();
   
    int arr[] = new int[n];
   
  
   
  
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int left = 0;
    int right = n-1;
    int temp = 0;
    while(left<right){
      if(arr[left]<0){
        left++;
      }
      else if(arr[right]>0){
        
        right--;
      }
      else{
     temp = arr[left];
     arr[left] = arr[right];
     arr[right] = temp;
     left++;
     right--;
    }
      }
      System.out.println("Implemented two-pointer unstable partition to move negatives left");

      for(int i = 0 ; i<n ; i++){
        System.out.println(+arr[i]);
      }
    }

}
