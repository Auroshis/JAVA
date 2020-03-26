void merge(int arr[], int l, int m, int r){
    //finding mid of the array and creating subarrays
    int n1 = m - l + 1;
    int n2= r - m;
    int[] t1 = new int[n1];
    int[] t2 = new int[n2];
    //transferring elements to subarrays
    for (int i =0; i<n1; i++){
        t1[i] = arr[i+l];
    }
    for (int j = 0; j < n2; j++){
        t2[j] = arr[m+j+1];
    }
    //important declarations
    int i=0,j=0;
    int k = l;
    //comparing corresponding elements of each subarrays
    while(i<n1 && j<n2){
        if(t1[i]<t2[j]){
            arr[k] = t1[i];
            i++;
        }
        else{
            arr[k] = t2[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k] = t1[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = t2[j];
        j++;
        k++;
    }
}

int[] sort(int arr[], int l, int r){
    if(r>l){
        int m = (l+r)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    return arr;
}