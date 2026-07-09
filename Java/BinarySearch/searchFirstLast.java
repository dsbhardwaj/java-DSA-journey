import java.util.Scanner;
public class searchFirstLast{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ener the elements in an array");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        //supposing the array is sorted

        int start = 0 ;
        int end = arr.length - 1 ;
        int mid ;
        int first = -1 ;
        int last = -1;

        while(start <= end){
            mid = start + (end - start)/2;
            if( target < arr[mid]){
                end = mid - 1 ;
            }else if (target > arr[mid]){
                start = mid + 1 ;
            }else{
                first = mid ;
                end = mid - 1;
            }
            }
            start = 0 ;
            end = arr.length - 1 ;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1 ;
            }else if(target >arr[mid]){
                start = mid + 1 ;
            }else{
                last = mid ;
                start = mid + 1 ;
            }
        }

        System.out.println("first occurence: " + first + "Last occurence : " + last);
    }
    }
