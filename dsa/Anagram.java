package DSA_practice.dsa;

public class Anagram {
    public static void main(String[] args) {
        String str = "apple";
        String goal = "pplet";
        Anagram jai = new Anagram();
        boolean result = jai.isAnagram(str, goal);
        System.out.println(result);
    }

    public boolean isAnagram(String str, String goal) {
        int[] arr = new int[26];
        if (goal.length() < str.length() || goal.length() > str.length()) return false;

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
            arr[goal.charAt(i) - 'a']--;
        }
        for (int count : arr) {
            if (count != 0) {
                return false;
            }

        }
        return true;
    }


}
