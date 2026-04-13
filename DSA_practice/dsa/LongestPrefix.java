package DSA_practice.dsa;

public class LongestPrefix {
    public static void main(String[] args) {


        String[] str = {"apple", "application", "apply", "applrove"};
        LongestPrefix prefix = new LongestPrefix();
        String result = prefix.longPrefix(str);
        System.out.println(result);
    }

    public String longPrefix(String[] str) {
        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);

            for (int j = 1; j < str.length; j++) {
                if (i == str[j].length() || str[j].charAt(i) != c) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}