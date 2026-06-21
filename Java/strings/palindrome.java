import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.next();
      //  for(int i = 0 ; i < str.length(); i++){
        //    System.out.println(str.charAt(i));
        //}
        //Reverse
    boolean isPalindrome = true;
    int left = 0;
    int right = str.length() - 1;
    while(left < right){
        if(str.charAt(left) != str.charAt(right)){
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }
 
        if(isPalindrome){
            System.out.println("palindrome");
        }else{
            System.out.print("not palindrome");
        }

    }
     

    }
