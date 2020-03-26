/*
Time Complexity: O(n*2)

Auxiliary Space: O(1)

Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.

Algorithmic Paradigm: Incremental Approach

Sorting In Place: Yes

Stable: Yes

Online: Yes

Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
*/
// Java program for implementation of Insertion Sort 
class InsertionSort { 
	/*Function to sort array using insertion sort*/
	void sort(int arr[]) 
	{   int shift = 0;
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { //It is important to pre increment 'i' , if you post increment 'i' output will be wrong, though there will be no error. 
			int key = arr[i]; 
			int j = i - 1; //'j' is like the prev in linked list, it contains the previous index value.

			/* Move elements of arr[0..i-1], that are 
			greater than key, to one position ahead 
			of their current position */
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
                j = j - 1; 
                shift ++;//this variable keeps tracks of no of shifting to be done
			} 
			arr[j + 1] = key; 
		} 
	} 

	/* A utility function to print array of size n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = { 12, 11, 13, 5, 6 }; 

		InsertionSort ob = new InsertionSort(); 
		ob.sort(arr); 

		printArray(arr); 
	} 
} 