import java.util.Scanner;
public class upperbound{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array : ");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter ARray elements: ");
     for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
     }
     System.out.println("Enter target: ");
     int target = sc.nextInt();

    int end = arr.length - 1;
    int start = 0;
    int mid;
    while(start <= end){
        mid = start + (end - start)/2;

        if(target < arr[mid]){
            end = mid - 1 ;
        }else{
            start = mid + 1 ;
        } 
    }
    if(start <= arr.length){
        System.out.println(arr[start]);
    }else{
        System.out.println("-1");
    }
    }
}