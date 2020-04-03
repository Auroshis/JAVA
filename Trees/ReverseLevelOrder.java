public void reversePrint(Node node) 
        {
            Stack<Node> stack = new Stack<Node>();
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node);
            while(!queue.isEmpty()){
            Node temp = queue.poll();
            stack.push(temp);
            if(temp.right != null) queue.add(temp.right);//first right
            if(temp.left != null) queue.add(temp.left);//then left is added to queue just the opposite of level order traversal
            
            }
            while(!stack.isEmpty()){
            Node temp = stack.peek();
            System.out.print(temp.data + " ");
            stack.pop();
            }
        }