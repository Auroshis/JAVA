//level order traversal can be used but there is a recursive method.
public static int size(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return(size(root.left)+1+size(root.right));//adding '1' to sum and moving to left and right node
        }
}

