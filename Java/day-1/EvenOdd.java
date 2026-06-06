import java.util.Scanner;
public class EvenOdd { 
    public static void main(String[] args){
          
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Number :  ");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("The Number You have Entered is " + num +"is an Even Number");

        }else{
            System.out.println("The Number You Have Entered is " +num+ "is an Odd Number");
        }
    
        


    }
    
}
