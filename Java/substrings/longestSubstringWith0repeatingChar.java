import java.util.HashSet;
import java.util.Scanner;
public class longestSubstringWith0repeatingChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<> ();
        int start = 0;
        int end = 0 ;
        int currentLength = 0;
        int maxLength = 0;

        for(end = 0 ; end < str.length() ; end++){
            while( set.contains(str.charAt(end)) == true){
                set.remove(str.charAt(start));
                start++;
            }
            set.add(str.charAt(end));
            currentLength = end - start + 1 ;
            maxLength = Math.max(maxLength , currentLength);

                }
                System.out.println(maxLength);
            }
        }

    
