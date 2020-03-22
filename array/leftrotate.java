import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {//name of the class should be leftrotate as per the file name

    void  reverse(int  arr[], int start, int end){
        while(start<end){
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    }

    int[] left_rotate(int arr[], int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        Solution obj = new Solution();
        int[] ans = obj.left_rotate(a,d);
        for (int j = 0; j<ans.length;j++){
            System.out.print(ans[j]);
        }
        scanner.close();
    }
}