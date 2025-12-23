import java.util.*;
public class Sumarray{
  public static void main(String[] args){
    System.out.println("enter the size of array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements of array");
      int sum = 0;
    for(int i = 0; i<n ; i++){
    
      arr[i] = sc.nextInt();
      sum += arr[i];

    }
    System.out.println("the sum of elements of array is :" +sum);
  }
}