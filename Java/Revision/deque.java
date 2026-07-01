import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class deque{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n -1];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i] = sc.nextInt();
           }
        System.out.println("enter the size of subarray");
        int k = sc.nextInt();

        int start = 0;
        int end = 0;
       Deque<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i < k ; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
             }
             System.out.println(arr[dq.peekFirst()]);

             //slide window ..
             for(end = k ; end < arr.length ; end++){
                if( start == dq.peekFirst()){
                    dq.pollFirst();
                }
                while(!dq.isEmpty() && arr[end] >= arr[dq.peekLast()]){
                    dq.pollLast();
                }
                dq.offerLast(end);
                start++;
             
             System.out.println(dq.peekFirst());
             }
    } 
    }

