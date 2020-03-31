import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B=0,H=0;
static boolean flag = true;

static{
Scanner in = new Scanner(System.in);
B = in.nextInt();
H = in.nextInt();
flag = true;
if(B<=0 || H<=0){
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    flag = false;
    System.exit(0);
}
}
public static void main(String[] args){