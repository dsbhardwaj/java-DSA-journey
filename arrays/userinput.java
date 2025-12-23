import java.util.*;
public class userinput{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();

    int arrays[] = new int[n];
//input
for(int i = 0 ; i<n ; i++){
  arrays[i] = sc.nextInt();
}
//output
    for(int i = 0; i<=n; i++){
      System.out.println(arrays[i]);

    }
 
  }
  
  }