import java.util.Scanner;
public class duplicate{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of the array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the values in array");
         for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();         }

        for(int i = 0 ; i < arr.length; i++){
          System.out.println(arr[i]);
        }

        //duplicate
        boolean duplicate = false ;
         for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i]==arr[j]){
                    duplicate = true;
                    break;

                }
                
            }
         }
         if(duplicate==true){
            System.out.println("Duplicate found "  );
         } else {
            System.out.println("No Duplicate found");
         }
        
    }
}

    
