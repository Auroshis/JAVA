while (!s1.empty() || !s2.empty()) { 
    // Print nodes of current level from s1 and push nodes of 
    // next level to s2 
    while (!s1.empty()) { 
        Node temp = s1.peek(); 
        s1.pop(); 
        System.out.print(temp.data + " "); 

        // Note that is right is pushed before left 
        if (temp.right != null) 
            s2.push(temp.right); 

        if (temp.left != null) 
            s2.push(temp.left); 
    } 

    // Print nodes of current level from s2 and push nodes of 
    // next level to s1 
    while (!s2.empty()) { 
        Node temp = s2.peek(); 
        s2.pop(); 
        System.out.print(temp.data + " "); 

        // Note that is left is pushed before right 
        if (temp.left != null) 
            s1.push(temp.left); 
        if (temp.right != null) 
            s1.push(temp.right); 
    } 
} 