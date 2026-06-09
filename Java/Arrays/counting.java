public class counting{
    public static void main(String[] args) {
         
         int[] arr = new int[5];
         arr[0] = 4;
         arr[1] = 7;
         arr[2] = 2;
         arr[3] = 9;
         arr[4] = 6;
        int count = 0;
         for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2 == 0){
                count++;

            }

         }
         System.out.println(count);
    }
}