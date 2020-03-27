import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A.toCharArray();
        int start = 0;
        int end = A.length()-1;
        boolean f = false;
        while(start<=end){
            if(A.charAt(start)==A.charAt(end)){
                f = true;
            }
            else{
                f = false;
                break;
            }
        start++;
        end--;
        }
        if(f){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}