import java.util.Scanner;
public class firstOccurence{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }
            
            System.out.println("Enter target:");
            int target = sc.nextInt();


        //first occurence
        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]){
               int index = i;
                System.out.println(index);
                break;
            }
        }
    }
}

    
