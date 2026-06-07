public class pattern4{
    public static void main(String[] args) {
        for(int i =1; i <=5 ; i++){
            for(int space = i; space > i - 1; space --){
                System.out.print(" ");
            }
            for(int star = i ; star <= 5 ; star++){
                System.out.print("*");
            }
        System.out.println();
        }

    }
}