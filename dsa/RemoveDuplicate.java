package dsa;

public class RemoveDuplicate {
    public static void main(String[] args){
        int count = 0;
        int[] a = {0,0,1,1,1,4,4,6,7,8,8,9};
        for(int num=0;num<a.length-1;num++){
            if(a[num]!=a[num+1]){
                count++;
            }
        }
        System.out.println("Unique number in the array is : "+count);
    }
}
