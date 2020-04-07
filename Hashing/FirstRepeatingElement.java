/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int firstRepeat(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        int min = -1;//this will contain the min index whose value is repeated
        int l = arr.length;
        while(l>0){
            if(set.contains(arr[l-1])){
                min = l;
            }
            else{
                set.add(arr[l-1]);
            }
            l--;
        }
        return min;
    }
	public static void main (String[] args) {
		    Scanner in = new Scanner(System.in);
		    int t = in.nextInt();
		    while(t>0){
		        int n = in.nextInt();
		        int[] arr = new int[n];
		        for(int i =0;i<n;i++){
		            arr[i] = in.nextInt();
		        }
		        int ans = firstRepeat(arr);
		        System.out.println(ans);
		        t--;
		    }
	}
}
//Time complexity of -O(n)
//This can be used to check for duplicates by little modification.