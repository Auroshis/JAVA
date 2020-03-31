
// Java program to demonstrate working of HashSet 
import java.util.*; 

class Test 
{ 
	public static void main(String[]args) 
	{ 
		HashSet<String> h = new HashSet<String>(); 

		// Adding elements into HashSet usind add() 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 
		h.add("India");// adding duplicate elements 

		// Displaying the HashSet 
		System.out.println(h); 
		System.out.println("List contains India or not:" + 
						h.contains("India")); 

		// Removing items from HashSet using remove() 
		h.remove("Australia"); 
		System.out.println("List after removing Australia:"+h); 

		// Iterating over hash set items 
		System.out.println("Iterating over list:"); 
		Iterator<String> i = h.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 
} 
//the size of HashSet gives you the no of unique elements/pairs.
//Unordered and unique.