import java.util.Scanner;
public class kzeroes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i] = sc.nextInt();
           }
        System.out.println("enter the value of k");
        int k = sc.nextInt();

        int start = 0;
        int end = 0;
        int Zerocount = 0;
        int currentLength = 0;
        int maxLength = 0;
             for(end = start ; end < arr.length ; end++){
                if(arr[end] ==0 ){
                    Zerocount++;
                }
                while(Zerocount > k){

                    if(arr[start] == 0){
                        Zerocount --;
                    }
                    start++;

                }
                  

            
                 currentLength = end - start + 1 ;
                

              maxLength =  Math.max(maxLength, currentLength);
                 
             }

             System.out.println(maxLength);
             
    } 
    }

