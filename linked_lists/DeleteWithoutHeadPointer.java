void deleteNode(Node node)
    {
         Node prev = null;Node Next = null;Node current = node;
         if(node==null) return;
         Next = current.next;
         current.data = Next.data;
         Next = Next.next;
         current.next = Next;
    }