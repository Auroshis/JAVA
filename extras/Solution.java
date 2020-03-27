import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int sum(Stack<Integer> s){
        int su = 0;
        for(int j =0;j<s.size();j++){
            su += s.get(j);
        }
        return su;
    }
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int count = 0;
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        System.out.println(h1[0],h2[0],h3[0]);
        /*for(int i = h1.length-1;i>=0;i--){
                s1.push(h1[i]);
        }
        for(int j = h2.length-1;j>=0;j--){
                s2.push(h2[j]);
        }
        for(int k = h3.length-1;k>=0;k--){
                s3.push(h3[k]);
        }*/
        for(int i = 0;i<h1.length;i++){
            s1.push(h1[i]);
        }
        for(int j = 0;j<h2.length;j++){
            s2.push(h2[j]);
        }
        for(int k = 0;k<h3.length;k++){
            s3.push(h3[k]);
        }

        while(sum(s1)!=sum(s2) && sum(s2)!=sum(s3)){
            if(sum(s1)>sum(s2) && sum(s1)>sum(s3)){
                s1.pop();
                count++;
            }
            else if(sum(s2)>sum(s1) && sum(s2)>sum(s3)){
                s2.pop();
                count++;
            }
            else if(sum(s3)>sum(s2) && sum(s3)>sum(s1)){
                s3.pop();
                count++;
            }
    }
    return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}