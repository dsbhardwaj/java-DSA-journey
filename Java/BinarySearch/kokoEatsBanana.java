public class kokoEatsBanana{
    public int calculateHours(int[] piles , int k){
        int totalHours = 0;
        for(int i = 0 ; i < piles.length ; i++){
           int hours = piles[i]/k;
           if(piles[i] % k != 0){
            hours++;
           }
           totalHours += hours ;   
                }
           return totalHours ; 
    }

    public int binarySearch(int[] piles , int h){
        int max = piles[0];
        for(int i = 0 ; i < piles.length ; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        } 

        int start = 1;
        int end = max ;
        int answer = 0;
        while(start <= end){
          int  mid = start + (end - start)/2;
            int totalHours = calculateHours(piles, mid);
            if( totalHours <= h){
                answer = mid;
                end = mid - 1  ;
            }else{
                start = mid + 1 ;
            }
        }
        return answer  ;
    }
}