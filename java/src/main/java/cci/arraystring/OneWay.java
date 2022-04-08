package cci.arraystring;

import java.util.Objects;

/**
 * One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class OneWay {

    public static boolean check(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 != ch2) {
                count++;
            }
            if (count == 2) {
                return false;
            }
        }
        return true;
    }

}
