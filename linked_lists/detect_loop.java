//Flloyd's algorithm using a fast pointer and slow pointer where fast pointer moves at double speed of 
//slow pointer. Fast pointer moves two nodes at once while slow pointer moves one node at once.
static boolean hasCycle(SinglyLinkedListNode head) {
    SinglyLinkedListNode fast = head;
    SinglyLinkedListNode slow = head;
    while(fast!= null && slow!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
            return true;
        }
    }
    return false;
}