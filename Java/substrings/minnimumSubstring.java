import java.util.HashMap;
import java.util.Scanner;
public class minnimumSubstring{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s:");
        String s = sc.nextLine();
        System.out.println("Enter String t:");
        String t = sc.nextLine();

        HashMap<Character , Integer> map = new HashMap<> () ;
        for(int i = 0 ; i < t.length() ; i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0 ) + 1);
        }

        int end = 0;
        int start = 0 ;
        int required = t.length();
        int minLength = 0;
        
        for(end = 0 ; end < s.length(); end++){
            
            if( map.containsKey(s.charAt(end)) == true){
                if(map.get(s.charAt(end)) > 0){
                    map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) - 1);
                    required --;
                }else {
                    map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) -1 );
                }
            }
            //Shrinking the window...
            while(required == 0){
                if(map.containsKey(s.charAt(start)) == true){
                    map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) + 1);
                    }
                if(map.get(s.charAt(start)) > 0){
                    required++;
                }
                start++;
                int currentWindow = end - start + 1;
                minLength = Math.min(currentWindow, minLength);
            }
        }
            System.out.println(minLength);
    }


}
        

