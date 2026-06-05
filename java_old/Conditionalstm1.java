import java.util.*;
class Conditionalstm1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age");
    int age = sc.nextInt();

    if (age>18){
      System.out.println("you are eligible for voting");
    }
    else{
      System.out.println("you are young to vote \n grow up bitch");
    }
  }

}