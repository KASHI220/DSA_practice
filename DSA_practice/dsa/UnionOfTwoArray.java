package DSA_practice.dsa;

import java.util.Arrays;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,4,};
        int[] b = { 2, 4, 6, 7, 9};
        UnionOfTwoArray obj = new UnionOfTwoArray();
        int[] result=obj.unionArray(a,b);
        for(int r : result){
            System.out.println(r+" ");
        }
    }

    public int[] unionArray(int[] a, int[] b) {
        int[] union = new int[a.length + b.length];
        int i = 0, j = 0,k=0;
        int n1 = a.length;
        int n2 = b.length;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (k == 0 || union[k-1] != a[i]) {
                    union[k++] = a[i];
                }
                i++;
            }
            else{
                if(union.length == 0 || union[k- 1] != b[j]) {
                    union[k++] = b[j];
                }
                j++;
            }
        }
        while(j<n2){
            if(union.length == 0 || union[k - 1] != b[j]) {
                union[k++] = b[j];
            }
            j++;
        }
        while(i<n1){
            if(union.length == 0 || union[k - 1] != a[i]) {
                union[k++] = a[i];
            }
            i++;
        }
        return Arrays.copyOf(union,k);
    }
}