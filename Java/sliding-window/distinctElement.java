import java.util.HashMap;
import java.util.Scanner;

public class distinctElement{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of subarray:");
        int k = sc.nextInt();
        
        HashMap<Integer, Integer>map = new HashMap <>();
        int end = 0;
        int start = 0;
        for( int i = 0 ; i < k ; i++){
           if(map.containsKey(arr[i] )== true){
            int  frequency = map.get(arr[i]);
            frequency = frequency + 1 ;
            map.put(arr[i] , frequency);
           }else{
            map.put(arr[i] , 1);
           }
        }
           System.out.println(map);
           System.out.println(map.size());
    

        for( end = k; end < arr.length ; end++){

        
     
            if(map.containsKey(arr[start]) == true && map.get(arr[start]) > 1){
                int freq = map.get(arr[start]);
                 freq = freq - 1;
                map.put(arr[start] , freq);
                }else if(map.containsKey(arr[start]) && map.get(arr[start]) == 1){
                    map.remove(arr[start]);
                }
                start++;
            if(map.containsKey(arr[end]) == true){
                int freqEnd = map.get(arr[end]);
                freqEnd = freqEnd + 1;
                map.put(arr[end] , freqEnd);
            }else{
                map.put(arr[end] , 1);
            }
            System.out.println(map);
           System.out.println(map.size());
        
            }
}
}