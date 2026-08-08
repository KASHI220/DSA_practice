package DSA_practice.dsa;

public class CountSubbArray {
    public static void main (String[] args){
        int[] arr= {1,3,1,4,5};
        int k = 4;
        CountSubbArray array =new CountSubbArray();
        int result=array.subArrayCount(arr, k);
        System.out.println(result);
    }
    public int subArrayCount(int [] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
