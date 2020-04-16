boolean isPalindrome(Node head) 
{
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
//Time complexity -O(n+m) -- O(n) ,where is the size of the LL and m is the size of Stack.