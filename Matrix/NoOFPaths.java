/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
		    int m = in.nextInt();int n = in.nextInt();
		    int[][] mat = new int[m][n];
		    for(int i=0;i<m;i++){
		        mat[i][0]=1;
		    }
		    for(int j=0;j<n;j++){
		        mat[0][j]=1;
		    }
		    for(int i=1;i<m;i++){
		        for(int j=1;j<n;j++){
		            mat[i][j] = mat[i-1][j]+mat[i][j-1];
		        }
		    }
		    System.out.println(mat[m-1][n-1]);
		    t--;
		}
	}
}
//Question is to find number of paths from top left corner to bottom right corner.