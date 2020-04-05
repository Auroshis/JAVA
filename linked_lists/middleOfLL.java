int getMiddle(Node head)
   {
        Node fast = head;
        Node slow = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;