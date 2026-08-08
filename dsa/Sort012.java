package DSA_practice.dsa;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args){
        int [] arr ={0,1,1,1,2,1,0,1,0,0,1,0,1,1,2,2,2,1};
        Sort012 result = new Sort012();
         result.sort102(arr);
         System.out.println(Arrays.toString(arr));

    }
    public void sort102(int [] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;

            }
        }
    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
