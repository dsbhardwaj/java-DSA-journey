import java.util.Scanner;
public class missingnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n -1];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i] = sc.nextInt();
           }
           int arraySum = n*(n+1)/2 ;
           int sum = 0 ;

           for(int i = 0 ; i < arr.length ; i++){
             sum = sum + arr[i];
           }
           if(arraySum != sum){
            int missingNumber = arraySum - sum ;
        System.out.println("The maximum sum of a subarray is : " + missingNumber);
           }
    }
    }

