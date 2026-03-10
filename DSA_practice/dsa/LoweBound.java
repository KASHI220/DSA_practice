package dsa;

import java.util.Arrays;

public class LoweBound {
    public static void main(String[] args) {
        int x=5;
        int[] a = {1,3,4,7,2,0};
        LoweBound low=new LoweBound();
        int result=low.ReturnLowerIndex(a,x);
        System.out.println(result);
    }

    public static int ReturnLowerIndex(int[] a,int x){
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]>=x ){
                return i;
            }
        }
        return a.length;
    }
}