import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class firstNegative{
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

    Queue<Integer> q = new LinkedList<>();
    int start = 0;
    int end = 0;
    for( end = 0 ; end< arr.length ; end++){
        if(arr[end] < 0){
            q.offer(arr[end]);
        } 
    int windowSize = end - start + 1;
    if(windowSize == k){
        if(!q.isEmpty()){
            System.out.println(q.peek());
        }else{
        System.out.println(0);}
        
        if(!q.isEmpty()){
        if(arr[start] == q.peek()){
            q.poll();
                  }
        }
        start++;
     }      }   
        }
    }
