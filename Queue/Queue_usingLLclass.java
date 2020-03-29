//since the operations were to get the value at the head/front ,add, remove elements LinkedList class is used.
//Time Complexity - q1.add(integer) - O(n) -- inserting at the tail.
//removing and reading the value at the head/front - O(1)
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for(int i =0;i<queries;i++){
            int choice = in.nextInt();
            if(choice == 1){
                int num = in.nextInt();
                q1.add(num);
            }
            else if(choice == 2){
                q1.remove();
                continue;
            }
            else if(choice == 3){
                System.out.println(q1.peek());
            }
        }
    }
}