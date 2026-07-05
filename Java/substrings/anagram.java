import java.util.HashMap;
import java.util.Scanner;
public class anagram{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s:");
        String s = sc.nextLine();
        System.out.println("Enter String t:");
        String p = sc.nextLine();

        HashMap<Character , Integer> p1 = new HashMap<> () ;
        HashMap<Character , Integer> s1 = new HashMap<> ();
        for(int i = 0 ; i < p.length() ; i++){
            p1.put(p.charAt(i) , p1.getOrDefault(p.charAt(i) , 0 ) + 1);
        }

        int end = 0;
        int start = 0;            
        for(end = 0 ; end < p.length(); end++){
                    s1.put(s.charAt(end), s1.getOrDefault(s.charAt(end), 0) + 1);
                    if(p1.equals(s1)){
                    System.out.println(start);
                    }
                    
                }

                for(end = p.length() ; end < s.length() ; end++){
                    
                       s1.put(s.charAt(start) , s1.getOrDefault(s.charAt(start), 0) - 1);
                
                     if(s1.get(s.charAt(start)) == 0){
                        s1.remove(s.charAt(start));
                        }
                        start++;
                        
                    s1.put(s.charAt(end), s1.getOrDefault(s.charAt(end), 0) + 1);
                    
                    if(p1.equals(s1)){
                        System.out.println(start);
                    } 
         
                }
        
                
                }
            }
        
    


        

