public class Test{
    public static void main(String[] args){
        String s = "hello";
        System.out.print(s.length());
        s.toCharArray();
        for(int i = 0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}