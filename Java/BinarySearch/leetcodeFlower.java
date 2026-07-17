public class leetcodeFlower{

    public int calculateBouquet(int[] bloomDay , int day , int k , int m){
        int consecutiveFlower = 0 ;
        int bouquet = 0 ;


        for (int i = 0; i <bloomDay.length; i++) {
            if(bloomDay[i] <= day){
                consecutiveFlower ++;}
                else{
                    consecutiveFlower = 0 ;
                }
             if(consecutiveFlower == k){
                bouquet ++ ;
                consecutiveFlower = 0 ;
            }
        }
          return bouquet ; 

    }

    public int binarySearch(int[] bloomDay  , int k , int m ){
       if((long)m*k > bloomDay.length){
        return -1 ;
       }
        int min = bloomDay[0];
        int max = bloomDay[0];
        for(int i = 0 ; i < bloomDay.length ; i++){
            if(bloomDay[i] < min){
                min = bloomDay[i];
            }
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
        }
        int start = min ;
        int end = max ; 
        int answer = 0 ;
        while(start <= end ){
           int mid = start + (end - start)/2 ;
           int bouquet = calculateBouquet(bloomDay, mid , k, m);
           if(bouquet >= m){
            answer = mid ;
            end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
            }
            return answer ;
    }
}