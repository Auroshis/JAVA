import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
    s.toCharArray();//converting to charracter array 
    int start = 0;
    int end = s.length()-1;
    int f = 0;
    while(end>start){
        if(s.charAt(start)==s.charAt(end)){
            continue;
        }
        else{
            f = 1;
        }
        System.out.println(s.charAt(start)+s.charAt(end));
        start++;
        end--;
    }
        if(f==1){
            return "NO";
        } 
        else{
            return "YES";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}