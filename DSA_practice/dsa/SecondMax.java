package dsa;
import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args){
        int[] a={1,35,46,-24,57,845,84,896,896,-345,900,900};
        int max= Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num : a){
            if(num>max){
                secondMax = max;
                max=num;
            } else if (num>secondMax && num<max ) {
                secondMax=num;
                
            }

        }
        System.out.println("the second larges number is :  "+secondMax);
    }
}
