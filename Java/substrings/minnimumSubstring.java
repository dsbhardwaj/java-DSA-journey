import java.util.HashMap;
import java.util.Scanner;
public class minnimumSubstring{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s:");
        String s = sc.nextLine();
        System.out.println("Enter String t:");
        String t = sc.nextLine();

        HashMap<Character , Integer> map1 = new HashMap<> ();
        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            map1.put(ch , map1.getOrDefault(ch, 0)+1);
        }

        int required = t.length();
        int end = 0;
        int start = 0;
        int minLength = 0;
        int minStart = 0;
        

        //Expanding the Window
        for(end = 0 ; end < s.length() ; end++){
            char ch = s.charAt(end);
            if(map1.containsKey(ch)){
                if(map1.get(ch) > 0){
                required --;
                }
                map1.put(ch, map1.getOrDefault(ch , 0) - 1);
            }

            //Shrinking the loop
            while(required == 0){
                char st = s.charAt(start);
                int currentBest = end - start + 1;
                if(map1.containsKey(st)){
                    map1.put(st, map1.getOrDefault(st , 0) + 1);
                    if(map1.get(st) > 0){
                        required++;
                    }
                
                }  
                start++;      
            }
        }
    
    }


}
        

