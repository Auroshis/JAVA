/* 
Given a string str and another string patt. Find the character in patt that is present at the minimum index in str. If no character of patt is present in str then print ‘No character present’.

Examples:

Input: str = “geeksforgeeks”, patt = “set”
Output: e
Both e and s of patt are present in str,
but e is present at minimum index, which is 1.
*/
//Time Complexity - O(m+n), 'm'-length of the string1 'n'-length of the string2
public static void solution(String s1, String s2){
    int mini = Integer.MAX_VALUE;
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    int l1 = s1.length();int l2 = s2.length();
    char[] c1 = s1.toCharArray();char[] c2 = s2.toCharArray();
    for(int i=0;i<l1;i++){
        if(map.containsKey(c1[i])==false){
            map.put(c1[i],i);
        }
    }
    for(int i=0;i<l2;i++){
        if(map.containsKey(c2[i]) && map.get(c2[i])<mini){
            mini = map.get(c2[i]);
        }
    }
    
    if(mini == Integer.MAX_VALUE){
        System.out.println("No character present");
    }
    else{
        System.out.print(c1[mini]);
    }
    
}