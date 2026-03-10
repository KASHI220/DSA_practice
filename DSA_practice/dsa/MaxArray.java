package dsa;

public class MaxArray {
    public static void main(String[] args) {
        int[] nums = {2,3 , 4, 32, 45, 23, 65, 78, -13, 56};
        int n = nums.length;
        MaxArray a = new MaxArray();
        a.maxElement(n, nums);
        int max = a.maxElement(n,nums);
        a.display(max);
    }

    public int maxElement(int n, int[] nums) {
        int max = nums[0];
        for (int i = 1; i < n ; i++) {
            if (nums[i]>max ) {
                max = nums[i] ;
            }

        }

        return max;
    }

    public void display(int max) {

        System.out.println("Maximum value in array is :" + max);
    }
}
