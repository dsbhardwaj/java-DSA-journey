import java.util.*;
class printname{

  public static void printMyName(String name){
      System.out.println(name);
      return;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      System.out.print("Have a GOOD day ");
      printMyName(name);
  }
}