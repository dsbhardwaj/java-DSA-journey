public class setZero{
    public  void search(int arr[][] ){
            int rows = arr.length;
            int col = arr[0].length;

           boolean zeroRows[] = new boolean[rows];
         boolean zeroCol[] = new boolean[col];

        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[0].length ; j++){

            if(arr[i][j] == 0){
            zeroRows[i] = true;
            zeroCol[j] = true;
         }
    }
        }

    for (int i = 0; i < rows; i++) {
    for (int j = 0; j < col; j++) {

        if (zeroRows[i] || zeroCol[j]) {
            arr[i][j] = 0;
        }

    }
}
    }
    
}