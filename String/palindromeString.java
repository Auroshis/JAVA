public class Test{
    public static void main(String[] args){
        String s = "{[()]}";
        //System.out.print(s.length());
        s.toCharArray();
        /*for(int i = 0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }*/
        int start = 0;
        int f=0;
        int end = s.length()-1;
        while(end>start){
            System.out.println(s.charAt(start)+" start");
            System.out.println(s.charAt(end)+" end");
            if(s.charAt(start)==s.charAt(end)){
                 f = 1;
            }
            else{
                f=0;
                break;
            }
            start++;
            end--;
        }
        System.out.println(f);
        if(f==0){
            return "NO";
        }
        else{
            return "YES";
        }
    }
}