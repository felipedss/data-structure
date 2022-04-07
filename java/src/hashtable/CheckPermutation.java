package hashtable;

import java.util.HashSet;

/*
https://leetcode.com/problems/permutation-in-string/submissions/

Result: Time Limit Exceeded, Need optimization
 */
public class CheckPermutation {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        HashSet<String> items = new HashSet<>();
        permutation(items, s1, "");
        for (String item : items) {
            if (s2.contains(item)) return true;
        }
        return false;
    }

    private static void permutation(HashSet<String> items, String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            items.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i);
            // Rest of the string after excluding the ith character
            String rest = str.substring(0, i) +
                    str.substring(i + 1);
            // Recursive call
            permutation(items, rest, ans + ch);
        }
    }

}
