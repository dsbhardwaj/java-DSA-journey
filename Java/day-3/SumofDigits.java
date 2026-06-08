import java.util.Scanner;
public class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0 ;
        int LastDigit = 0;
    
        while(num>0){
            LastDigit = num%10;
            sum = sum + LastDigit ;
            num = num/10;


            

        }
        System.out.println(sum);

    }
}