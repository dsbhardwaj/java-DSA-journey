import java.util.Scanner;
public class whileLoop{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int num = sc.nextInt();
     int NewNum;
     int count = 0;
     while(num > 0){
        NewNum = num/10;
        count++;
        num = NewNum;

         
    }
    

    System.out.print( + count);
    
    
       
}

}