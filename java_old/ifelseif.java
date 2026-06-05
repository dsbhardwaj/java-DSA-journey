import java.util.*;
class ifelseif{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();
    if(a>b){
      System.out.println("a is greater than b");
    }
     else if(a<b){
      System.out.println("b is greater than a");
    }
    else{
      System.out.println("a is equals to b");
    }
   
  }
}