Node addTwoLists(Node first, Node second) {
    Node temp = null;Node head = null;Node tail = null;
    int carry = 0,sum = 0;
    while(first!=null || second!=null){
        sum = carry + ((first!=null)?first.data:0) + ((second!=null)?second.data:0);
        carry = (sum>=10)?1:0;
        sum = sum%10;
        temp = new Node(sum);
        
        if(head==null){
            head = temp;
        }
        else{
            tail.next = temp;
        }
        tail = temp;
        
        if(first!=null){
            first = first.next;
        }
        if(second!=null){
            second = second.next;
        }
    }
    if(carry>0){
        tail.next = new Node(carry);
    }
    return head;
}