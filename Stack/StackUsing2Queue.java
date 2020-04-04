class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    if(q1.isEmpty()) return -1;
	    int l = q1.size();
	    for(int i =0;i<l-1;i++){
	        q2.add(q1.poll());
	    }
	    int r = q1.poll();
	    int t = q2.size();
	    for(int i = 0;i<t;i++){
	        q1.add(q2.poll());
	    }
	    return r;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    q1.add(a);	
    }
}
