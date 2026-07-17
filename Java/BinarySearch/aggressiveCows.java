import java.util.Arrays;
public class aggressiveCows{
public int placedCows(int[] arr , int dist){
    int cow = 1 ;
    int cowPlacedAt = arr[0];
    for(int i = 0 ; i < arr.length ; i++){
        if((arr[i] - cowPlacedAt) >= dist){
            cowPlacedAt = arr[i];
            cow++;
        }
    }
    return cow ;
} 

public int binarySearch(int[] stablePosition , int cows){
    Arrays.sort(stablePosition);
    int min = stablePosition[0];
    int max = stablePosition[0];
    for (int i = 0; i < stablePosition.length ; i++) {
        if(stablePosition[i] < min){
            min = stablePosition[i];
        }
        if(stablePosition[i] > max){
            max = stablePosition[i];
        }
    }
    int start = 1 ;
    int end = max - min;
    int answer = 0;
    while(start <= end){
        int mid = start + (end - start)/2;
        int placed = placedCows(stablePosition, mid);
        if(placed >= cows){
            answer = mid ;
            start = mid+1 ;
        }else{
            end = mid - 1 ;
        }
    }
    return answer ;
}
}