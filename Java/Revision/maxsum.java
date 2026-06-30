import java.util.Scanner;
public class maxsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i] = sc.nextInt();
           }
           System.out.println("enter the size of sub array:");
           int k = sc.nextInt();
           int start = 0;
           int end = k-1 ;
           int sum = 0;
           int maxSum = 0;
           for(start = 0 ; start <=end ; start++){
              sum = sum + arr[start];
           }
              maxSum = sum;
           
           for(end = k ; end < arr.length ; end++){
             sum = sum - arr[start] + arr[end] ;
            start++;
            maxSum = Math.max(maxSum , sum);

           }
            
        
    
        System.out.println("The maximum sum of a subarray is : " + maxSum);
    }
    }

