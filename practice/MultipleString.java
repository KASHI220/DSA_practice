package practice;

import java.util.Arrays;

public class MultipleString{

    public static void main(String[] args){
        String [] a={"a","b","c","d"};
        String [] b={"e","f","g","h","z"};
        String [] c={"i","j","k","l"};

        int i=a.length;
        int j=b.length;
        int k=c.length;

        int x=(int)(Math.random()*i);
        int y=(int)(Math.random()*j);
        int z=(int)(Math.random()*k);

        String phase=z+" "+y+" "+z;

        System.out.println(phase);

        System.out.println(Arrays.toString(a)+"   "+Arrays.toString(b)+"    "+"   "+Arrays.toString(c));


    }
}