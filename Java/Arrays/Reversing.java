import java.util.Scanner;
public class Reversing{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        //REVERSING AN ARRAY 
    int left = 0;
    int right = arr.length - 1;
    while(left<right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;

    }    
    for(int i = 0 ; i < arr.length ; i++){
    System.out.println(arr[i]);
}
    

   
    }

    }
