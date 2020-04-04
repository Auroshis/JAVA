public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      Stack<Integer> s = new Stack<Integer>();
      if(q.isEmpty() || k>q.size() || k<=0){
          return q;
      }
      for(int i =0;i<k;i++){
          s.push(q.poll());
      }
      for(int j=0;j<k;j++){
          q.add(s.pop());
      }
      for(int p =0;p<q.size()-k;p++){
          q.add(q.poll());
      }
      return q;
    }