import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i =0;i<n;i++){
            list.add(in.nextInt());
        }
        int queries = in.nextInt();
        for(int j = 0; j<queries;j++){
            String query = in.next();
            if(query.equals("Insert")){
                int index = in.nextInt();
                int num = in.nextInt();
                list.add(index,num);
            }
            else if(query.equals("Delete")){
                int index = in.nextInt();
                list.remove(index);
            }
        }
        for(int k : list){
            System.out.print(k+" ");
        }
    }
}