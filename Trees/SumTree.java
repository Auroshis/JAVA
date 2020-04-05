/* A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0. 
A leaf node is also considered as SumTree.*/
//Time complexity of below solution - O(n)
class Tree
{
    public int isLeaf(Node node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        return 0; 
    } 
	boolean isSumTree(Node node)
	{
             if(node==null || isLeaf(node)==1){
                 return true;
             }
             if(isSumTree(node.left)!=false && isSumTree(node.right)!=false){
                 int ls,rs;
                 if(node.left==null){
                     ls=0;
                 }
                 else if(isLeaf(node.left)==1){
                     ls = node.left.data;
                 }
                 else{
                     ls = 2*node.left.data;
                 }
                 
                 if(node.right==null){
                     rs=0;
                 }
                 else if(isLeaf(node.right)==1){
                     rs=node.right.data;
                 }
                 else{
                     rs = 2*node.right.data;
                 }
                 
                 if(node.data == ls+rs){
                     return true;
                 }
                 else {
                     return false;
                 }
             }
             return false;
	}
}