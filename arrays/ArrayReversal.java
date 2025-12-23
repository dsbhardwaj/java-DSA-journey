import java.util.*;
public class ArrayReversal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the Size of Array:");
    int n = sc.nextInt();
    int[] OriginalArray = new  int[n];
    int[] ExtraArray =  new int[n];
    for(int i = 0; i<n ; i++){
      OriginalArray[i] = sc.nextInt();
    }

    for(int i = 0; i<n ; i++){
      ExtraArray[i] = OriginalArray[n-1-i];
    }
    System.out.println("The Reversed Array is:");
    for(int i = 0; i<n ; i++){
      System.out.println(+ ExtraArray[i]);
    }

  }
}