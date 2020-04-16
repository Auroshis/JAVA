static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       LinkedList<Integer> q = new LinkedList<Integer>();
       vis[s] = true;
       q.add(s);
       while(!q.isEmpty()){
           s = q.poll();
           System.out.print(s+" ");
           
           Iterator<Integer> i = list.get(s).listIterator();
           while(i.hasNext()){
               int n = i.next();
               while(!vis[n]){
                   vis[n] = true;
                   q.add(n);
               }
           }
       }
    }
    //nov is the number of vertices .
    //s is the starting vertex from which printing in BFS order will start.