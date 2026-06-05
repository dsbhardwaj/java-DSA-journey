import java.util.*;
public class LeftRotation{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the Size of Array:");
    int n = sc.nextInt();
    int[] OriginalArray = new  int[n];
    int[] ExtraArray =  new int[n];
    for(int i = 0; i<n ; i++){
      OriginalArray[i] = sc.nextInt();
    }
    System.out.println("Enter the value for left rotation:");
    int k = sc.nextInt();

    k = k%n; //edge case ####important 
    int index = 0;

    for(int i = k; i<n ; i++){
      ExtraArray[index++] = OriginalArray[i];
    }
    for(int i = 0; i<k ; i++){
      ExtraArray[index++] = OriginalArray[i];
    }

    System.out.println("The Rotated Array is:");
    for(int i = 0; i<n ; i++){
      System.out.println( ExtraArray[i]);
    }

  }
}