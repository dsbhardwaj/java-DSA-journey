import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class maxElement{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements");
        for(int i= 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of subarray");
        int k = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0 ; i < k ; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
            System.out.println(arr[dq.peekFirst()]);
        

        int end = 0;
        int start = 0;
        for(end = k ; end < arr.length ; end++){
           if(dq.peekFirst() == start){
            dq.pollFirst();
           }
           while(!dq.isEmpty() && arr[end] >= arr[dq.peekLast()]){
            dq.pollLast();
           }
           dq.offerLast(end);
           start++;
           System.out.println(arr[dq.peekFirst()]);
        }

            
    }    

        }

        
    
