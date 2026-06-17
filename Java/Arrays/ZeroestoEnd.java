import java.util.Scanner;
public class ZeroestoEnd{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }
            
            //move zeroes to end 
        
            int write =  0;
            
            for(int i = 0 ; i<arr.length ; i++){
                if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[write];
                arr[write] = temp; 
                write++;
                
                
                }
            }

            for(int i = 0 ; i< arr.length ; i++){
                System.out.println(arr[i]);
            }

                

            

      
        }
    
}

    
