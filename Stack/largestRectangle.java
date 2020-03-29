import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static long minimum(Stack<Integer> s){
        long mini = 0;
        if(s.size()==0){
            return mini;
        }
        mini = s.get(0);
        for(int i =0;i<s.size();i++){
            mini = (s.get(i)<mini)?s.get(i):mini;
        }
        return mini;
    }
    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        Stack<Integer> s = new Stack<Integer>();
        for(int k =h.length-1;k>=0;k--){
                s.push(h[k]);
        }

        long area = 0;
        for(int i=0;i<h.length;i++){
            long small = minimum(s);
            long breadth = h.length-i;
            long temp = small*breadth;
            area = Math.max(area,temp);
            s.pop();
        }
        return area;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}