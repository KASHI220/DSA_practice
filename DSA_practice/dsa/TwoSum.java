package DSA_practice.dsa;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums= {4,3,22,56,4,23,5,36,1,21};
        int target= 45;
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
    public int [] twoSum(int [] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
