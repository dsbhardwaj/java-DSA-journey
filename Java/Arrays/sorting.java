import java.util.Scanner;
public class sorting{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }

       // for(int i = 0 ; i < arr.length; i++){
         //   System.out.println(arr[i]);
        //}
        boolean Sorted = true;
         for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] > arr[i+1]){
                 Sorted = false;
                 break;
         } 
            }
    if( Sorted == true){
        System.out.println("Array is sorted ");
    }else{
        System.out.println("Unsorted");
    }
}

    }
