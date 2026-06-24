
import java.util.Scanner;
public class countWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.nextLine();
        int count= 0;
        for(int i = 0 ; i< str.length(); i++){
            if( str.charAt(i) != ' '){

            if(i == 0 || str.charAt(i - 1) == ' '){
                count++;

            }
        }
        }
            System.out.print("total words:" +count);
        
      
        
    }
} 

    
