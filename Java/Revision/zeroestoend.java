import java.util.Scanner;
public class zeroestoend{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i] = sc.nextInt();
        }

        int read = 0;
        int write = 0;
        for( read = 0 ; read< arr.length ; read++){
            if(arr[read] != 0){
                //swap with write.
                int temp = arr[read];
                arr[read] = arr[write];
                arr[write] = temp;
                write++;
            }
        }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    }

}