int diameter(Node root) {
        if(root==null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        
        return (Math.max(lheight + rheight+1,Math.max(ldiameter,rdiameter)));
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return (1 + Math.max(height(root.left), height(root.right)));
    }

//Time complexity - O(n*2)