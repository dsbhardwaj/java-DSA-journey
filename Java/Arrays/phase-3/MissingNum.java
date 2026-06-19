import java.util.Scanner;
public class MissingNum{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of array");
    for(int i = 0 ; i<n ; i++){
         arr[i] = sc.nextInt();
    }   

     //missing number
     int sum = 0;
     int actualSum = 0;
    for(int i = 1 ; i <= n+1 ; i++){
        sum = i*(i+1)/2;
        }
    for(int i = 0 ; i<arr.length ; i++){
        actualSum = actualSum + arr[i];
    }

    int difference = sum - actualSum;

    if(difference == 0){
        System.out.println("No missing element");
    }if(difference > 0){
        System.out.println("missing Number:" + difference);

    }
    }

}     
