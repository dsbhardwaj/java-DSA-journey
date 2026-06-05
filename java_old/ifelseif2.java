import java.util.*;
class ifelseif2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      System.out.println("Choose a button from \n 1 \n 2 \n 3");
    int button = sc.nextInt();
  
    if(button==1){
      System.out.println("Namaste ");
    }
     else if(button==2){
      System.out.println("Bella ciao");
    }
     else{
      System.out.println("Bonjour");
    }

  }
}
