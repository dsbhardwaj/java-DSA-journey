import java.util.Scanner;
public class rotatedArrays{
    public int search(int[] arr , int target){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array : ");
     int n = sc.nextInt();
     System.out.println("Enter ARray elements: ");
     for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
     }
     System.out.println("Enter target: ");


    int end = arr.length - 1;
    int start = 0;
    int mid;
        while(start <= end){
        mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid ;
        }
        else if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
            end = mid - 1;
            }else{
                start = mid + 1 ;
            }
        }else{
            //right half
            if(target > arr[mid] && target <= arr[end]){
            start = mid +  1 ;
            }else{
                end = mid - 1;
            }    
        }
    }
    return -1 ;
        
    }
}
