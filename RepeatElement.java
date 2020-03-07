class RepeatElement 
{ 
	void printRepeating(int arr[], int size) 
	{ 
		int count[] = new int[size]; 
		int i; 

		System.out.println("Repeated elements are : "); 
		for (i = 0; i < size; i++) 
		{ 
			if (count[arr[i]] > 1) { 
				count[arr[i]]++;
			}
			else if (count[arr[i]] == 1){
				System.out.print(arr[i] + " ");
				count[arr[i]]++;
			}
			else
				count[arr[i]]++; 
		} 
		System.out.println("\nCount array");
		for(i = 0; i<size;i++){
			System.out.print(count[arr[i]]);
		}
	} 

	public static void main(String[] args) 
	{ 
		RepeatElement repeat = new RepeatElement(); 
		int arr[] = {4,2,4,2,2}; 
		int arr_size = arr.length; 
		repeat.printRepeating(arr, arr_size); 
	} 
} 