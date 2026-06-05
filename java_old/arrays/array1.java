import java.util.*;
public class array1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter Array Elements");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
     for(int i=0; i<n; i++){
      System.out.println(arr[i]);
     }

  }
}