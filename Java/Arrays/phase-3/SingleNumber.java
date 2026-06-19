import java.util.Scanner;
public class SingleNumber{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of array");
    for(int i = 0 ; i<n ; i++){
         arr[i] = sc.nextInt();
    }   

     //Single Number
     for(int i = 0; i < arr.length ; i++){
    int count = 0 ;
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[i] == arr[j]){
            count ++;
        }
        }
     
          if(count == 1){
            System.out.println("Single Number : " + arr[i]);
            break;
          }
        
        
     }
    }
}

 
