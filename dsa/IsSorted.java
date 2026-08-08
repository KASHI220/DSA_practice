package dsa;

public class IsSorted {
    public static void main(String[] args){
        int[] a={1,20,3,4,5,6,7};
        IsSorted b =new IsSorted();

        if(b.isSorted(a)){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }


    }
    public boolean isSorted(int[] a){
       for (int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
       return true;
    }
}
