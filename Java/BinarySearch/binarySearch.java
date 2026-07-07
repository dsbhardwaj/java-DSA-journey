import java.util.Scanner;

public class binarySearch{
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array :");
         int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter array Elements:");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your Target Value:");
        int target = sc.nextInt();
        boolean isSorted = true ;
        //check if sorted
        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
                isSorted = true;
            }else{
                isSorted = false;
                System.out.println("Please Enter a Sorted Array");
                break;
            }
        }
            //Binary Search...
            int start = 0;
            int end = arr.length - 1;
            while(isSorted == true && end >= start){
                int mid = start + (end - start)/2;
                if(arr[mid] < target){
                    start = mid + 1;
                }else if(arr[mid] > target){
                    end = mid - 1;
                }else if(arr[mid] == target){
                    System.out.println("Target found at index: " + mid);
                    break;
                }
                    System.out.println("Target Not Found");
                
        }
    }
}