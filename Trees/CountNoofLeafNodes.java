/*
Algorithm
getLeafCount(node)
1) If node is NULL then return 0.
2) Else If left and right child nodes are NULL return 1.
3) Else recursively calculate leaf count of the tree using below formula.
    Leaf count of a tree = Leaf count of left subtree + Leaf count of right subtree
*/
int countLeaves(Node node) 
    {
        if(node == null){
            return 0;
        }
        else if(node.left == null && node.right == null){
            return 1;
        }
        else{
            return countLeaves(node.left)+countLeaves(node.right);
        }
    }

//with little modification you can use the above code to find sum of leaf nodes
public int SumofLeafNodes(Node root)
    {   int sum = 0;
        if(root == null){
            return 0;
        }
        else if(root.left==null && root.right==null){
            return root.data;
        }
        else{
            return SumofLeafNodes(root.left)+SumofLeafNodes(root.right);
        }
        
    }