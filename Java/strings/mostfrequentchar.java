import java.util.HashMap;
import java.util.Scanner;
public class mostfrequentchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();

        HashMap<Character , Integer>map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            if(map.containsKey(str.charAt(i)) == false){
                map.put(str.charAt(i) , 1);
            }else{
                int freq = map.get(str.charAt(i));
                freq = freq + 1;
                map.put(str.charAt(i) , freq);
            }
        }
        int mostOccuring = 0;

        char ch = ' ' ;
        for(int i = 0 ; i < str.length() ; i++){
            if(map.get(str.charAt(i)) >= mostOccuring){
                mostOccuring = map.get(str.charAt(i));
                ch = str.charAt(i);    
            }
        }
        System.out.println("most Occuring char:" + ch +  " with frequency: " + mostOccuring );

    }
}