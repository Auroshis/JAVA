import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> list = new Stack<Integer>();
        Stack<Integer> Tracklist = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        int indicator = in.nextInt();
        if(indicator == 1){
            int x = in.nextInt();
            list.push(x);
            if(list.size()==1){
                Tracklist.push(x);
                return;
            }
            if(x>Tracklist.peek()){
                Tracklist.push(x);
            }
            else{
                Tracklist.push(Tracklist.peek());
            }
        }
        else if(indicator == 2){
            list.pop();
            Tracklist.pop();
        }
        else if(indicator == 3){
            System.out.println(Tracklist.peek());
        }
    }
}