

public class rowWiseSorted{
    public boolean  search( int arr[][] , int target){
        int i = 0 ;
        int start = 0 ;
        int end = arr[0].length - 1;
            while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[i][mid] == target){
                return true;
                
            }else if (arr[i][mid] < target){
                start = mid + 1 ;
            }else if(arr[i][mid] > target ){
                end = mid - 1 ;
            }
                i++;
            

        }
        return false ;

    }
}