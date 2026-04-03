package DSA_practice.dsa;

public class SubbArraySum {
    public static void main(String[] args) {
        int[] nums = {1,3,5,3,6,2,7,2,3,5,3,3,6};
        int k = 14;
        int count =0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
