import java.util.Scanner;
public class maxAverage{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter array elements:");
    for(int i = 0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("enter the size of subarray");
    int k = sc.nextInt();

    int Windowsum = 0 ;
    int maxSum = 0;
    for(int i = 0 ; i < k ; i++){
        Windowsum = Windowsum + arr[i];
        maxSum = Windowsum;
    }
        for(int i = k ; i < arr.length ; i++){
        Windowsum = Windowsum - arr[i -k] + arr[i];
        maxSum = Windowsum;
    
     maxSum = Math.max(maxSum , Windowsum);
        }
    int maxAverage = maxSum / k;
    System.out.println("The maximum sum of a subarray is:" + maxAverage);
    }
}
