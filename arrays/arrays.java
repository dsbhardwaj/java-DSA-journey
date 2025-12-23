import java.util.*;

public class arrays{
  public static void main(String[] args){
    int[] marks = new int[4];
    marks[0] = 23;
    marks[1] = 43;
    marks[2] = 00;
    marks[3] = 45;

    // System.out.println(marks[0]);
    // System.out.println(marks[3]);
    // System.out.println(marks[2]);
    // System.out.println(marks[1]);

    for(int i=0; i<4;i++){
      System.out.println(marks[i]);
    }
  }
}