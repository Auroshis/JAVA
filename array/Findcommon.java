import java.util.*;
class Findcommon{
    void intersect(int a1[], int a2[], int a3[]){
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length && k<a3.length){
            if(a1[i]==a2[j] && a2[j]==a3[k]){
                System.out.print(a1[i]);
                i++;j++;k++;
            }
            else if(a1[i]<a2[j]){
                i++;
            }
            else if(a2[j]<a3[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }

    public static void main(String args[]){
        int a1[] = {1,2,3,4,5,6};
        int a2[] = {1,2,3};
        int a3[] = {1,5,6};
        Findcommon obj = new Findcommon();
        obj.intersect(a1, a2, a3);
    }
}

//Time complexity - O(n)