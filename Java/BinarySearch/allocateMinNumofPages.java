public class allocateMinNumofPages{
    public int totalBook(int[] arr , int pages ){
        int book = 1 ;
        int totalPages = 0 ;

        for(int i = 0 ; i <arr.length ; i++){
            if((totalPages + arr[i]) <= pages){
                totalPages += arr[i];
            }else{
                book++;
                totalPages = arr[i];
            }

        }
        return book ;
    }
    public int binarySearch(int[] pages , int student){
        int max = pages[0];
        int maxSum = 0;
        for(int i = 0 ; i<pages.length ; i++){
            maxSum += pages[i];
            if(pages[i] > max){
                max = pages[i];
            }
        }
        int start = max ;
        int end = maxSum;
        int answer = 0 ;
        while(start <= end){
            int mid = start + (end - start)/2;
            int studentNeeded = totalBook(pages, mid);
            if(studentNeeded <= student){
                answer = mid;
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return answer ;
    }

    }
