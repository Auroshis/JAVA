boolean isPalindrome(Node head) 
{
    boolean ans = true;
    Stack<Integer> s = new Stack<Integer>();
    Node current = head;Node c2 = head;
    while(current!=null){
        s.add(current.data);
        current = current.next;
    }
    while(c2!=null){
        if(s.peek()==c2.data) {
            s.pop();
            c2 = c2.next;
            continue;}
        else return false;
    }
    return true;
}    