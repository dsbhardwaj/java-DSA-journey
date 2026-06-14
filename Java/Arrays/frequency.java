import java.util.Scanner;
public class frequency{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }


        System.out.println("enter the element you want to find frequency for:");
        int target =sc.nextInt();
        int count = 0;
        //Freuency 
        for(int i = 0 ; i<arr.length ; i++){
            if(target == arr[i]){
              count++;
            }
        }
            System.out.println("the frequency is: " + count);
    }   

   
    }

    
