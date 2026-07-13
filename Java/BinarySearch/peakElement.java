import java.util.Scanner;
public class peakElement{
    public int search(int[] arr){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array : ");
     int n = sc.nextInt();
     System.out.println("Enter ARray elements: ");
     for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
     }


    int end = arr.length - 1;
    int start = 0;
    int mid;
        while(start < end){
        mid = start + (end - start)/2;
        if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
        else{
            start = mid + 1;   
        }
        }
return start; 
}
}