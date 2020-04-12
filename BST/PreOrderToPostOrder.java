/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
    public static Node preToBST(int[] pre){
        Node root = new Node(pre[0]);
        Stack<Node> s = new Stack<Node>();
        s.push(root);
        
        for(int i=1;i<pre.length;++i){
            Node temp = null;
            while(!s.isEmpty() && pre[i]>s.peek().data){
                temp = s.pop();
            }
            if(temp!=null){
                temp.right = new Node(pre[i]);s.push(temp.right);
            }
            else{
                temp = s.peek();
                temp.left = new Node(pre[i]);
                s.push(temp.left);
            }
        }
        return root;
    }
    
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
		    int n = in.nextInt();
		    int[] arr = new int[n];
		    for(int i =0;i<n;i++){
		        arr[i] = in.nextInt();
		    }
		    postorder(preToBST(arr));
		    System.out.print("\n");
		    t--;
		}
	}
}
class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 