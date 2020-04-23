class GfG
{
    Node head;
    void Util(Node node){
        if(node==null) return;
        Util(node.right);
        node.right = head;
        if (head != null) 
            (head).left = node; 
  
        head = node; 
  
        // Recursively convert left subtree 
        Util(node.left); 
    }
    Node bToDLL(Node root)
    {
	    Util(root);
	    while(root.left!=null){
	        root = root.left;
	    }
	    return root;
    }
}
//inorder traversal 
// time complexity- O(n)