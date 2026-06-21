import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.next();
      //  for(int i = 0 ; i < str.length(); i++){
        //    System.out.println(str.charAt(i));
        //}
        //Reverse
        
     for( int i = str.length() -1 ; i >= 0 ; i--){
            System.out.println(str.charAt(i));
     }

    }}
