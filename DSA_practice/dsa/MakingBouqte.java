package DSA_practice.dsa;

public class MakingBouqte {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4, 7, 8, 8, 8, 9, 10, 4, 4, 3};
        int m = 3, k = 3;
        MakingBouqte obj = new MakingBouqte();
        int result=obj.minDays(arr,m,k);
        System.out.println(result);

    }

    public int minDays(int[] arr, int m, int k) {
        int low = 1;
        int max = 0;
        for (int num : arr) {
            if (num > max) max = num;
        }
        int high = max;

        if (arr.length < (long)(k*m) return -1;
        while (low <= high) {
            int mid = (int) low+(high - low) / 2;
            if (noOfBouquet(arr, k, mid, m)) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean noOfBouquet(int[] arr, int k, int day, int m) {
        int bouquet = 0;
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (day >= arr[j]) {
                count++;
            } else {
                bouquet += count / k;
                count = 0;
            }
        }
        bouquet += count / k;
        return bouquet >= m;
    }
}
