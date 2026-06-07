public class pattern3{
    public static void main(String[] args) {

        for(int i = 1 ; i <=5 ; i++){
            for(int space = 5-i ; space >= 1 ; space--){
             System.out.print(" ");
             }
             for (int stars = i ;  stars > 0 ; stars--){
                System.out.print("*");
             }
             System.out.println();

    }
        }
}