import java.util.*;
public class allZeroestoEnd{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array :");
int n =  sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the Elements of array:");
for(int i = 0; i<n ; i++){
  arr[i] = sc.nextInt();
}
int write = 0;
for(int i = 0; i<n;i++){
  if(arr[i] == 0){ }
 else{
    arr[write] = arr[i];
    write++;
  }
}
  for (int i = write ; i < n ; i++){
    arr[i] = 0;
  }
   
  System.out.println("the Final Array is : ");
   for(int i = 0 ; i<n ; i++){
  System.out.println(+arr[i]);
   }
  }
}
  
  
