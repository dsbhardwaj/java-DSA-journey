public class maxm{
    public static void main(String[] args){

        int[] array = new int[5];
       
        array[0] = 5;
        array[1] = 14;
        array[2] = 23;
        array[3] = 43;
        array[4] = 243;

    int max = array[0];

    for(int i = 0 ; i < array.length ; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    System.out.println(max);

    }
}