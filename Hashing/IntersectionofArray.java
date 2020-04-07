/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		while(t>0){
		    int n = in.nextInt();int m = in.nextInt();
		    for(int i=0;i<n;i++){
		        int ele = in.nextInt();;
		        if(list.contains(ele)==false){
		            list.add(ele);
		        }
		    }
		    for(int j=0;j<m;j++){
		        int ele1 = in.nextInt();
		        if(list.contains(ele1) && list.size()>0){
		            list.remove(ele1);
		            count++;
		        }
		    }
		    System.out.println(count);
		    count = 0;
		    t--;
		}
	}
}