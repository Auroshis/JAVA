if (root1 == null && root2 == null)  return true;  
  
    // Return false if one is empty and other is not  
    if (root1 == null || root2 == null) return false;  
  
    // Create an empty queues for simultaneous traversals  
    Queue<Node> q1 = new LinkedList<Node> (); 
    Queue<Node>  q2 = new LinkedList<Node> ();  
  
    // Enqueue Roots of trees in respective queues  
    q1.add(root1);  
    q2.add(root2);  
  
    while (!q1.isEmpty() && !q2.isEmpty())  
    {  
        // Get front nodes and compare them  
        Node n1 = q1.peek();  
        Node n2 = q2.peek();  
  
        if (n1.data != n2.data)  
        return false;  
  
        // Remove front nodes from queues  
        q1.remove(); 
        q2.remove();  
  
        /* Enqueue left children of both nodes */
        if (n1.left != null && n2.left != null)  
        {  
            q1.add(n1.left);  
            q2.add(n2.left);  
        }  
  
        // If one left child is empty and other is not  
        else if (n1.left != null || n2.left != null)  
            return false;  
  
        // Right child code (Similar to left child code)  
        if (n1.right != null && n2.right != null)  
        {  
            q1.add(n1.right);  
            q2.add(n2.right);  
        }  
        else if (n1.right != null || n2.right != null)  
            return false;  
    }  
    return true;
  