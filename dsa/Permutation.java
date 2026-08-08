package DSA_practice.dsa;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Permutation main = new Permutation();
        main.permutation(arr);
        for (int val : arr) {
            System.out.print(val + ",");
        }
    }

    public static void permutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
    }
}

