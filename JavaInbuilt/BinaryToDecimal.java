/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
		    int n = in.nextInt();
		    String n1 = String.valueOf(n);
		    if(Integer.parseInt(n1,2)%3==0){
		        System.out.println("1");
		    }
		    else System.out.println("0");
		    t--;
		}
	}
}
//needs further improvement in logic