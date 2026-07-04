import java.util.HashMap;
import java.util.Scanner;
public class permutationString{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2 :");
        String s2 = sc.nextLine();

        HashMap<Character , Integer> map1 = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i++){
         map1.put(s1.charAt(i) , map1.getOrDefault(s1.charAt(i) ,0 ) + 1);       
        }

        HashMap<Character , Integer > map2 = new HashMap<>();
        int end = 0;
        int Start = 0 ; 
        for( end = 0 ; end < s1.length() ; end++){
            if(map2.containsKey(s2.charAt(end)) == false){
                map2.put(s2.charAt(end), 1);
            }else{
                int freq2 = map2.get(s2.charAt(end));
                freq2 = freq2 + 1 ;
                map2.put(s2.charAt(end), freq2);
            }
            if(map1.equals(map2)){
                System.out.println("True");
                break;
            }
        }
            for(end = s1.length() ; end < s2.length() ; end++){
                if(map2.containsKey(s2.charAt(end)) == false){
                    map2.put(s2.charAt(end), 1);
                }else{
                    int f = map2.get(s2.charAt(end));
                    f = f + 1;
                    map2.put(s2.charAt(end), f);
                }
            
            if(map2.get(s2.charAt(Start)) > 1){
                int frequency = map2.get(s2.charAt(Start));
                frequency = frequency -1 ;
                map2.put(s2.charAt(Start) ,  frequency);
            }else{
                map2.remove(s2.charAt(Start));
                
                }
                Start++;

                if(map1.equals(map2)){
                    System.out.println("True");
                    break;
                }
            }
        }
    }       
 
