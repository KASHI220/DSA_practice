package dsa;

public class CheckIthBit {
    public boolean chekBit(long n, long k) {
        String a = Long.toBinaryString(n);
        char[] charArray = a.toCharArray();

        System.out.println(charArray);
        if (k >= charArray.length) {
            return false;
        }

            for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        System.out.println(charArray);
        if (charArray[(int)k] == '1') {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        long n = 975;
        long k = 10;
        CheckIthBit binary = new CheckIthBit();
        boolean result = binary.chekBit(n, k);
        System.out.println(result);
    }

}
