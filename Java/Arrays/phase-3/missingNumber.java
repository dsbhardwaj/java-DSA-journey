import java.util.Scanner;
public class missingNumber{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of array");
    for(int i = 0 ; i<n ; i++){
         arr[i] = sc.nextInt();
    }   

     //missing number
     int i ;
    
    for( i = 1 ; i < n+1 ; i++){
        boolean found = false;
        for( int j = 0; j < arr.length; j++){
        
            if(arr[j] == i){
                found = true ;
                break;
            }
        }

        if(!found){
            System.out.println("missing element:" + i);
        }
            }
    }

    }

      
