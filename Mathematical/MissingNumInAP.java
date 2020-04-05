/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int sum =0,actual_sum = 0;
		while(t>0){
		    int n = in.nextInt();
		    int[] arr = new int[n];
		    for(int i =0;i<n;i++){
		        arr[i] = in.nextInt();
		        sum += arr[i];
		    }
		    actual_sum =((arr[0]+arr[n-1])*(n+1))/2;//sum = (1st element + last element)*n/2, n - is the number of elements including the missing element but in question it is given in n-1 form.
		    System.out.println(actual_sum-sum);
		    sum = 0;
		    t--;
		}
	}
}