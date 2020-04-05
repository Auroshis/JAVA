public void reverse(String str){
       char[] a = str.toCharArray();
       Stack<Character> s = new Stack<Character>();
       for(Character c : a){
           s.push(c);
       }
       for(int i =0;i<str.length();i++){
           System.out.print(s.peek());
           s.pop();
       }
       System.out.print("\n");
    }
