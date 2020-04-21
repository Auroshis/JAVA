public Node rotate(Node head, int k) {
    int count = 0,length=0;
    if(k==0) return head;
    Node current = head;
    while(current!=null){
        current = current.next;
        length++;
    }
    if(k==length){
        return head;
    }
    Node Kth = head;Node K1 = head;Node tail = head;
    while(count!=(k-1) && Kth.next!=null){
        Kth = Kth.next;
        count++;
    }
    K1 = Kth.next;
    while(tail.next!=null){
        tail = tail.next;
    }
    Kth.next = null;
    tail.next = head;
    head = K1;
    return head;
}