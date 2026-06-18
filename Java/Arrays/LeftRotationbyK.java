import java.util.Scanner;
public class LeftRotationbyK{
    public static void Reverse(int left , int right , int[] arr ){
            while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;

        }
    }

    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }
            System.out.println("Enter the Rotation value");
            int k = sc.nextInt();
            
            //Rotation
            if(k > arr.length){
            k = k% arr.length;}

            
        Reverse(0 , k-1 , arr);
        Reverse(k , arr.length - 1 , arr);
        Reverse(0 , arr.length-1 , arr);
            
                
            for(int i = 0 ; i< arr.length ; i++){
                System.out.println(arr[i]);
            }
    }
}
         

      
        
    


    
