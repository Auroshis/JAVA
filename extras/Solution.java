import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//The algorithm is correct but it didn't work so i had to use inbuilt Arrays.sort(arr);
public class Solution {
    
    static void merge(int arr[], int l, int m, int  r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] t1 = new int[n1];
        int[] t2 = new int[n2];

        for(int i = 0 ;i<n1;i++){
            t1[i] = arr[l+i];
        }
        for(int j = 0;j<n2;j++){
            t2[j] = t2[m + j + 1];
        }

        int i = 0, j = 0;
        int k = l;
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

    static int[] mergesort(int arr[], int l, int r){
        if(r>l){
            int mid = (r+l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        return arr;
    }
    // Complete the findMedian function below.
    static int findMedian(int[] arr) {
            int[] sorted_arr = mergesort(arr,0,arr.length-1);
            int median_index = arr.length/2;//assuming odd no of elements in the array
            return arr[median_index];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = findMedian(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}