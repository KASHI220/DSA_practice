package dsa;

import java.lang.Math;

public class PerfectSqurt {
    public static void main(String[] args){
        int n=11;
        int a=(int) Math.sqrt(n);
        if(a*a==n){
            System.out.print(a);
        }
        else {
            System.out.print("no Perfect squreroot");
        }
    }

}
