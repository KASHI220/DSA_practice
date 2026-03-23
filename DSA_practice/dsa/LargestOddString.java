package DSA_practice.dsa;

public class LargestOddString {
    public static void main(String[] args) {
        String s = "032607592";
        LargestOddString odd =new LargestOddString();
        String result=odd.LargestOdd(s);
        System.out.println(result);
    }

    public String LargestOdd(String s) {
        int right = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                right = i;
                break;
            }

        }
        if (right == -1) return "";
        int left = 0;
        while (left < right && s.charAt(left) == '0') {
            left++;
        }
        return s.substring(left, right + 1);
    }
}