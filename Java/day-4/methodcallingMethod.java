public class methodcallingMethod{

    public static int square(int a){
        return a*a;
    }
    public static int cube(int b){
        return square(b)*b;

    }
    public static void main(String[] args){
        
        System.out.println(square(4));
        System.out.println(cube(4));


         
        
    }
}