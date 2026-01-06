int write = 0;
for(int i = 0; i<n;i++){
  if(arr[i] == 0){ }
 else{
    arr[write] = arr[i];
    write++;
  }
  while(arr[i]> write){
    arr[i] = 0;
  }
   }