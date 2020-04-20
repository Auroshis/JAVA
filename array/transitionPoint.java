int binarySearch(int[] arr, int l, int r, int x){
        if(r>=l){
            int m = l+(r-l)/2;
            if(arr[m]==x){
                while(m>0){
                    m--;
                    if(arr[m]==0) return m+1;
                }
                return m;
            }
            else if(arr[m]>x){
                return binarySearch(arr,l,m-1,x);
            }
            else{
                return binarySearch(arr,m+1,r,x);
            }
        }
        return -1;
    }
    int transitionPoint(int arr[], int n) {
        return binarySearch(arr,0,n-1,1);
    }