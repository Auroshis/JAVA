import java.util.*;
class SortandSearch{
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

    int binarysearch (int arr[], int l, int r, int x){
        if (r>=l){
            int mid = l +(r - l)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                return binarysearch(arr, l, mid-1, x);
            }
            if(arr[mid] < x){
                return binarysearch(arr, mid+1, r, x);
            }
        }
        return -1;
    }
    
    static void printarray(int arr[]){
        for (int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String args[]){
        int[] arr ={1,7,8,9,6,1};
        SortandSearch ob = new SortandSearch();
        int sorted_array[] = ob.sort(arr,0,arr.length-1);
        printarray(sorted_array);
        int result = ob.binarysearch(sorted_array, 0, arr.length-1, 7); 
        if (result == -1) 
            System.out.println("\nElement not present"); 
        else
            System.out.println("\nElement found at index " + result); 
    }
}