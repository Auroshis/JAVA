import java.io.*;
import java.util.*;

public class Test{

    public static int sum(Stack<Integer> s){
        int su = 0;
        for(int i =0;i<s.size();i++){
             su = su + s.get(i);
        }
        return su;
    }
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<Integer>();
        s1.add(1);
        s1.add(8);
        System.out.println(sum(s1));
    }
}