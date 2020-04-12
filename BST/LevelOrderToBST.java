//Convert Level Order Traversal to BST is same as insertion into binary search tree.
class GFG {
    public static Node insert(Node root,int data) {
            if(root == null){
                root = new Node(data);
                return root;
            }
            if(data<root.data){
                root.left = insert(root.left,data);
            }
            else if(data>root.data){
                root.right = insert(root.right,data);
            }
    	return root;
    }
    public Node constructBST(int[] arr){
         Node ans = null;
         for(int i =0;i<arr.length;i++){
             ans = insert(ans,arr[i]);
         }
         return ans;
    }
}