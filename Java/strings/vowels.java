import java.util.Scanner;
public class vowels{
    public static void main(String[] args) {
        
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter Your String");
    String str = sc.next();
    
    int count = 0 ;
    for( int i = 0 ; i < str.length() ; i++){
        System.out.println(str.charAt(i));

        char ch = str.charAt(i);
        if( ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O' || ch == 'U'){
            count++;
        }

    }
    System.out.println("Total Vowels :" + count);
    }
    
}  
