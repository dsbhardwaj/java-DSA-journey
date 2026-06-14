import java.util.Scanner;
public class lastOccurence{
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


        //last occurence
         int index = -1;


            for( int i =0; i < arr.length ; i++){
                if(target == arr[i]){
                    index = i;
                }
            
            }
            System.out.println(index);
    
    }
}

    
