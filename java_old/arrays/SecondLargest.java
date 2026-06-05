import java.util.*;
public class SecondLargest{
  public static void main(String[] args){
    System.out.println("enter the size of array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements of array");  
    for(int i = 0; i<n ; i++){
    
      arr[i] = sc.nextInt();

    }
      int largest = arr[0];
      int secondlargest = arr[1];
      for( int i = 0 ; i<n; i++){
        if(arr[i]> largest){
          secondlargest = largest;
         largest = arr[i];
          
        }
      if(arr[i]>secondlargest && arr[i]< largest){
        secondlargest = arr[i];
      }
     
        }
          System.out.println("the Second Largest element of an array is :" + secondlargest);    
      }
     
  }
