public static Node lca(Node root, int v1, int v2) {
    if(root==null){
        return null;
    }
      while(root!=null){
          if(root.data == v1 || root.data == v2){
              return root;
          }
          else if(v1<root.data && v2<root.data){
              root = root.left;
          }
          else if(v2>root.data && v1>root.data){
              root = root.right;
          }
          else{
              break;
          }
      }
      return root;
}

public static Node insert(Node root, int data) {
    if(root == null) {
        return new Node(data);
    } else {
        Node cur;
        if(data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }
}
//Time complexity - O(h)-- 'h' is the height of the tree.
//Since it is iterative method it does not require extra space.