// JAVA program to check whether two strings 
// are anagrams of each other 
import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 

class GFG { 

	/* function to check whether two strings are 
	anagram of each other */
	static boolean areAnagram(char[] str1, char[] str2) 
	{ 
		// Get lenghts of both strings 
		int n1 = str1.length; 
		int n2 = str2.length; 

		// If length of both strings is not same, 
		// then they cannot be anagram 
		if (n1 != n2) 
			return false; 

		// Sort both strings 
		Arrays.sort(str1); 
		Arrays.sort(str2); 

		// Compare sorted strings 
		for (int i = 0; i < n1; i++) 
			if (str1[i] != str2[i]) 
				return false; 

		return true; 
	} 

	/* Driver program to test to print printDups*/
	public static void main(String args[]) 
	{ 
		char str1[] = { 't', 'e', 's', 't' }; 
		char str2[] = { 't', 't', 'e', 'w' }; 
		if (areAnagram(str1, str2)) 
			System.out.println("The two strings are"
							+ " anagram of each other"); 
		else
			System.out.println("The two strings are not"
							+ " anagram of each other"); 
	} 
} 

// Time complexity O(nlogn)

//without using any in-built methods
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;
    }

  public static void main(String[] args) {