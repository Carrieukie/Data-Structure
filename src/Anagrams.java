/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 */
public class Anagrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] table = new int[26];

        for (int i = 0; i < s.length(); i++)
            table[s.charAt(i) - 'a']++;


        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;

            if (table[t.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
