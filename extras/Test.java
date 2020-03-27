import java.io.*;
import java.util.*;

public class Test{

    public static void main(String[] args){
        String A = "acbd";
        String B = "bcda";
        char[] temp = A.toCharArray();
        Arrays.sort(temp);
        String ans = new String(temp);
        System.out.println(ans);
    }
}