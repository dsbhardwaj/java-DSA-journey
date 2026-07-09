import java.util.Scanner;
public class floorceil{
    public static int floor(int[] arr , int target) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
         arr = new int[n];
        System.out.println("ener the elements in an array");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        target = sc.nextInt();

        //supposing the array is sorted

        int start = 0 ;
        int end = arr.length - 1 ;
        int mid ;

        //floor 

        while(start <= end){
            mid = start + (end - start)/2;
            if( target < arr[mid]){
                end = mid - 1 ;
            }else if (target > arr[mid]){
                start = mid + 1 ;
            }else{
                return arr[mid];
            }
            }
            if(end >= 0){  // for ceil start <= arr.length -1
            return arr[end]; //for ceil  return arr[start];
            }else{
                return -1;
            }
    
    }
    }
