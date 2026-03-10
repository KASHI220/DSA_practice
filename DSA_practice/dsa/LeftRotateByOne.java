package dsa;

public class LeftRotateByOne {
    public static void main(String[] args){
        int[] a={1,2,4,5,6};
        int temp=a[0];
        for(int i=1;i<a.length-1;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;

        System.out.print("Left rotation by one :");
        for(int num :a){
            System.out.print(num+" ");
        }

    }
}
