import java.util.Arrays;
import java.util.Scanner;
public class AnagramArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s:");
        String s = sc.nextLine();
        System.out.println("Enter String t:");
        String p = sc.nextLine();

        int[] pattern = new int[26];

        for(int i = 0 ; i < p.length() ; i++){
            char ch = p.charAt(i);
            pattern[ch - 'a']++;
        }

        int end = 0;
        int start = 0 ;
        int[] window = new int[26];

        for(end = 0 ; end < p.length() ; end++){
           window[s.charAt(end) - 'a']++;}
           if(Arrays.equals(pattern, window) == true){
            System.out.println(start);

        }
        for(end = p.length() ; end < s.length() ; end++){
            char st = s.charAt(start);
            window[st - 'a']--;
            start++;
            char en = s.charAt(end);
            window[en - 'a']++;

            if(Arrays.equals(pattern , window) == true){
                System.out.println(start);
            }
        }
                
                }
            }
        
    


        

