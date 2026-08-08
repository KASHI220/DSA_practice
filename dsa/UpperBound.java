package dsa;

import java.util.Arrays;

public class UpperBound {
    public static void main(String[] args){
        int tar=5;
        int [] a={1,35,23,3,6,78,4,2};
        Arrays.sort(a);
        UpperBound upindex =new UpperBound();
        int result=upindex.ReturnUpperIndex(a,tar);
        System.out.println(result);
    }
    public int ReturnUpperIndex(int[] a,int tar){
        for(int i=0;i<a.length;i++){
            if(a[i]>tar){
                return i;
            }
        }
        return a.length;
    }
}
