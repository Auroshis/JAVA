// Instead of creating matrix, you can create jagged arrays i.e, each array index contains one array(array of arrays)
//In syntax, basically 'int' is replaced by 'ArrayList<Integer>'
//Declaration ArrayList<Integer>[] arr = new ArrayList[n];
// ArrayList<Integer> arr = new ArrayList<Integer>(n);
/*
//Taking input data for jagged arrays
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        ArrayList<Integer>[] arr = new ArrayList[queries];
        for(int i = 0;i<queries;++i){
            int n = scanner.nextInt();
            arr[i] = new ArrayList<Integer>(n);
            for(int j = 0;j<n;++j){
                int e = scanner.nextInt();
                arr[i].add(e);
            }
        }
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int inputno = scanner.nextInt();
        ArrayList<Integer>[] outer = new ArrayList[inputno];
        for(int i = 0;i<inputno;++i){
            int n = scanner.nextInt();
            outer[i] = new ArrayList<Integer>(n);
            for(int j = 0;j<n;++j){
                outer[i].add(scanner.nextInt());
            }
        }
        //Taking input queries
        int queryno = scanner.nextInt();
        for(int i = 0;i<queryno;++i){
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            try{
                System.out.println(outer[row-1].get(column-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }


    }
}