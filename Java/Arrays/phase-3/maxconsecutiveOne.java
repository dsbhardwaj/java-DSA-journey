import java.util.Scanner;
public class maxconsecutiveOne{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of array");
    for(int i = 0 ; i<n ; i++){
         arr[i] = sc.nextInt();
    }   

     //Consecutive one.

     int currentStreak = 0;
     int bestStreak = 0;

     for(int i = 0 ; i < arr.length ; i++){
        if (arr[i] == 1){
            currentStreak++;
        }if(currentStreak > bestStreak){
            bestStreak = currentStreak;
        }else{
            currentStreak = 0;
        }
    
     }
     System.out.println("The maximum Streak is :" + bestStreak);
    }

}     
