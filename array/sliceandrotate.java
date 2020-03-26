import java.util.*;
class sliceandrotate{
    int[] slice(int arr[], int start, int end){
        int[] temp = new int[end-start +1];
        if (start<end && start>0 && end >0) {
            for (int i = 0; i < (end-start +1); i++){
                temp[i] = arr[i+start];
            }
        }
        return temp;
    }

    void reverse(int arr[], int start, int end){
        //we can iterate from last but the methoc used below does not require extra space i.e, no new array is required.
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    int[] right_rotate(int arr[], int k){
        //we have to rotate right the array by k elements
        // i thought of slicing  and merging, but the below algo is better
        //the answer is same for both left and right shift
        reverse(arr, 0, arr.length-1);//for left shift you don't have to reverse the entire array i.e this step is not required
        reverse(arr, 0, k-1); 
        reverse(arr, k, arr.length-1);
        //reverse(arr, 0, arr.length-1);//for left shift you have to reverse at last
        return arr;
    }
    static void printarray(int arr[]){
        for(int k =0; k<arr.length; k++){
            System.out.print(" "+arr[k]);
        }
    }
    public static void main(String[] args){
        sliceandrotate obj = new sliceandrotate();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sliced[] = obj.slice(arr,2,5);//0 index inclusive
        printarray(sliced);
        System.out.println("\noriginal array");
        printarray(arr);
        int rotated[] = obj.right_rotate(arr,2);
        printarray(rotated);
    }
}