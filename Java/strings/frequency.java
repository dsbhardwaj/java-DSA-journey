import java.util.HashMap;
import java.util.Scanner;
public class frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.next();
      

      HashMap<Character,Integer >map = new HashMap<>();
      for(int i = 0 ; i < str.length() ; i++){
        if(map.containsKey(str.charAt(i)) == false){
            map.put(str.charAt(i),1);
        }else{
          int freq =  map.get(str.charAt(i));
          freq = freq + 1 ;
          map.put(str.charAt(i) , freq);
        
            
        }
      }
            System.out.println(map);
    }
     

    }
