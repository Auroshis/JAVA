/*Applicable for positive elements only
You have to take size of count array = biggest element */

/*Basic Method
class RepeatElement 
{ 
	void printRepeating(int arr[], int size) 
	{ 
		int i, j; 
		System.out.println("Repeated Elements are :"); 
		for (i = 0; i < size; i++) 
		{ 
			for (j = i + 1; j < size; j++) 
			{ 
				if (arr[i] == arr[j]) 
					System.out.print(arr[i] + " "); 
			} 
		} 
	} 

	public static void main(String[] args) 
	{ 
		RepeatElement repeat = new RepeatElement(); 
		int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
		int arr_size = arr.length; 
		repeat.printRepeating(arr, arr_size); 
	} 
} 
Time-O(n*n) Space - O(1)
*/ 

/*
class RepeatElement 
{ 
	void printRepeating(int arr[], int size) 
	{ 
		int i; 
		System.out.println("The repeating elements are : "); 
	
		for(i = 0; i < size; i++) 
		{ 
			if(arr[Math.abs(arr[i])] > 0) 
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
			else
				System.out.print(Math.abs(arr[i]) + " "); 
		}		 
	} 

	
	public static void main(String[] args) 
	{ 
		RepeatElement repeat = new RepeatElement(); 
		int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
		int arr_size = arr.length; 
		repeat.printRepeating(arr, arr_size); 
	} 
} 

Time - O(n) Space - O(1)
*/



import java.util.*;
class RepeatElement 
{   
	void printRepeating(int arr[], int size, int k) 
	{ 
		int count[] = new int[size]; 
		int i,kth_count=0; 

		System.out.println("Repeated elements are : "); 
		for (i = 0; i < size; i++) 
		{ 
			if (count[arr[i]] > 1) { 
				count[arr[i]]++;//third visit or more
			}
			else if (count[arr[i]] == 1){
				System.out.print(arr[i] + " ");//second time visit
				count[arr[i]]++;
			}
			else
				count[arr[i]]++; //first time visit
		} 
		for(i=0; i < size; i++){
			 if(count[i] >= 1){
				 kth_count++;
			 }
			 if(k==kth_count)
			 {
				 System.out.println("The"+k+" repeated element is"+arr[i]);
				 break;
			 }
		}
		System.out.println("\nCount array");
		for(i = 0; i<size;i++){
			System.out.print(count[arr[i]]);
		}
	} 
	 

 	public static void main(String[] args) 
	{ 
		RepeatElement repeat = new RepeatElement(); 
		System.out.println("enter the k to find kth repeated element");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int arr[] = {4,2,4,2,2}; 
		int arr_size = arr.length; 
		repeat.printRepeating(arr, arr_size, k); 
	} 
} 
//Time - O(n) Space - O(n)
//Limitation- the size of the array has to be as large as the largest number due to the index hashing approach
 