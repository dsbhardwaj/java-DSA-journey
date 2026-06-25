import java.util.HashMap;
import java.util.Scanner;
public class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter your sencond string:");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("not anagram");
            return;
        }
        HashMap<Character , Integer>map1 = new HashMap<>();
        for(int i = 0 ; i < str1.length() ; i++){
            if(map1.containsKey(str1.charAt(i)) == false){
                map1.put(str1.charAt(i) , 1);
            }else{
                int freq = map1.get(str1.charAt(i));
                freq = freq + 1;
                map1.put(str1.charAt(i) , freq);
            }
        }
        
    HashMap<Character , Integer>map2 = new HashMap<>();
    for(int i = 0 ; i < str2.length() ; i++){
        if(map2.containsKey(str2.charAt(i)) == false ){
            map2.put(str2.charAt(i) , 1);
        }else{
            int freq = map2.get(str2.charAt(i));
            freq = freq +1;
            map2.put(str2.charAt(i) , freq);
        }

    }

    if(map1.equals(map2)){
        System.out.println("Anagram");
    }else{
        System.out.println("not anagram");
    }
    }
}