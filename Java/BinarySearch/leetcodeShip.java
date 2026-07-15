public class leetcodeShip{
    public int calculateDays(int[] weight , int capacity){
    int days = 1 ;
    int currentLoad = 0;
    for(int i = 0 ; i < weight.length ; i++){
        if((currentLoad + weight[i]) <= capacity){
            currentLoad += weight[i];
        }else{
            days++;
            currentLoad = weight[i];
        }
        
    }
    return days;
    }

    public int binarySearch(int weight[] , int days ){
        int answer = 0;
        int max = weight[0];
        int sum = 0 ;
        for(int i = 0 ; i < weight.length ; i++){
            sum += weight[i];
            if(weight[i] > max){
                max = weight[i];
            }
        }
        int start = max ;
        int end = sum ;
        while(start <= end){
        int mid = start + (end - start)/2 ;
        int totalDays = calculateDays(weight,  mid);
        if(totalDays <= days){
            answer = mid ;
            end = mid - 1 ;
        }else{
            start = mid+ 1 ;
        }

        }
        return answer ;
    }
    
}