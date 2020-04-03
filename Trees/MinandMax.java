public static int findMax(Node root)
	{   
	    if(root==null){
	        return Integer.MIN_VALUE;
	    }
	    int current = root.data;
	    int left = findMax(root.left);
	    int right = findMax(root.right);
	    if(left>current){
	        current = left;
	    }
	    if(right>current){
	        current = right;
	    }
	    return current;
	}
	public static int findMin(Node root)
	{
	    if(root ==  null){
	        return Integer.MAX_VALUE;
	    }
        int current = root.data;
        int left = findMin(root.left);
        int right = findMin(root.right);
        if(left<current){
            current = left;
        }
        if(right<current){
            current = right;
        }
	    return current;
	}