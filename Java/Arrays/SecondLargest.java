import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }

       // for(int i = 0 ; i < arr.length ; i++){
         //   System.out.println(arr[i]);
        //}

        //Second Largest 
    int OldLargest = 0;
    int Largest = arr[0];
    int SecondLargest = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] > Largest){
            OldLargest = Largest;
            SecondLargest = OldLargest;
            Largest = arr[i];
        }
        if( arr[i] >= SecondLargest && arr[i] < Largest){
            SecondLargest = arr[i];
        }
    }
            System.out.println("The Second Largest Value inside the Array is :" + SecondLargest);    
    }   

   
    }

    
