public int Sum(Node root){
    if(root==null){
        return 0;
    }
    else{
        return (Sum(root.left)+root.data+Sum(root.right));//adding data of current node and moving to next child at a time
    }
}