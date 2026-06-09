public class calculate{
    public static int add(int a , int b){
        return a + b;
    }
    public static int multiply(int a , int b){
        return a * b ;
    }
    public static int calculate(){
        return(multiply(add(4,5), 5));
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
