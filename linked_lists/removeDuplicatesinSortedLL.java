static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
    SinglyLinkedListNode current = head;
    SinglyLinkedListNode temp = current;

    while(current!=null){
        while(temp!=null && temp.data == current.data){
            temp = temp.next;
        }
        current.next = temp;
        current = current.next;
    } 
    return head;

}
//always check for null pointer exception