package dsa;

import java.util.Arrays;

public class ReturnIndex {
    public static void main(String[] args) {
        int tar = -249;
        int[] a = {1, 4, 7, 8, 5, 3, 7, -2, -24};
        ReturnIndex index = new ReturnIndex();
        int result=index.returnTargaet(tar, a);
        System.out.println(result);

    }

    public int returnTargaet(int tar, int[] a) {
         Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == tar) {
                return i;
            }
        }
        return -1;
    }


}
