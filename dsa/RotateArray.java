package DSA_practice.dsa;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        RotateArray array = new RotateArray();
        array.rotateKTimesBruteForce(arr, k);
        System.out.println();
        array.rotateKTimesRightOptimal(arr1, k);
    }

    public void rotateKTimesBruteForce(int[] arr, int k) {
//        int count=0;
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];

        // 1. Copy first k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // 2. Shift the rest of the array to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // 3. Put temp elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
        System.out.println("Using Brute force method");
        for (int num : arr) {
            System.out.print(num);
            System.out.print(" ");
        }
    }

    public void rotateKTimesRightOptimal(int[] arr1, int k) {
        int n = arr1.length;
        if (n == 0) return;

        k = k % n;

        reverse(arr1, 0, n - 1);
        reverse(arr1, 0, k - 1);
        reverse(arr1, k, n - 1);

        System.out.println("Right Rotation (Optimal):");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


