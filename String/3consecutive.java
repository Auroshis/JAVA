public static long modified(String a){
    int l = a.length();
    long count = 0;
    if(l<3) return 0;
    for(int i=2;i<l;i++){
        if(a.charAt(i)==a.charAt(i-1) && a.charAt(i-1)==a.charAt(i-2)){
            count++;
            i++;
        }
    }
    return count;
}