
import java.util.HashMap;
import java.util.Scanner;
public class firstnonappearingchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.next();
        HashMap<Character, Integer>map = new HashMap<>();
        int freq ;
        for(int i = 0 ; i< str.length(); i++){
            if(map.containsKey(str.charAt(i)) == false){
                map.put(str.charAt(i) , 1);
            }else{
                freq = map.get(str.charAt(i));
                freq = freq + 1;
                map.put(str.charAt(i) , freq);
            }
        }
            for(int i = 0 ; i < str.length() ; i++){
                int frequency = map.get(str.charAt(i));
                if(frequency == 1){
                  System.out.println(str.charAt(i));
                   break;
                }

                

            }
            

        }
}
        
    
     

    
