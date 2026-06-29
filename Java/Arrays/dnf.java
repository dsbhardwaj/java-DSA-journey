
import java.util.Scanner;

public class dnf{
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter array Elements");
     for(int i =0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
     }

     int low = 0;
     int mid = 0;
     int high = arr.length -1;

     while(mid <= high){
        if(arr[mid] == 0){
            //swap with left
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;

            low++;
            mid++;
        }else if(arr[mid] == 1){
            mid++;
        }else if(arr[mid] == 2){
            //swap with high 
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;

            high --;
        }
     }
     for(int i = 0 ; i < arr.length ; i++){
     System.out.println(arr[i]);
     }
    }
}