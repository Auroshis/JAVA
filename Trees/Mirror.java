void mirror(Node node)
    {
            if(node == null){
                return;
            }
            if(node.left==null && node.right==null)
            {
                return;
            }
	        mirror(node.left);
	        mirror(node.right);
	        Node temp = node.left;
	        node.left = node.right;
	        node.right = temp;
    }