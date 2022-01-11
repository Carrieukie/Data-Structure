import java.util.HashMap;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */
public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        System.out.println(firstUniqCharArr("aabbz"));
    }

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> mappings = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!mappings.containsKey(c)) {
                mappings.put(c, 1);
            } else {
                mappings.put(c, mappings.get(c) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.get(c) == 1){
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqCharArr(String s) {
        if (s.isEmpty()) return -1;
        // array to store occurance of each character
        // at index (int)char-(int)'a'
        // i.e. from 0-25
        int[] charCount = new int[26];

        // counting the occurance of each character
        for (char ch : s.toCharArray()) {
            charCount[(int) ch - (int) 'a'] += 1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == 1) {

                // if occurance is 1
                // means it is unique
                // hence computing the ndex first unique character
                int index = s.indexOf((char) (97 + i));
                if (index < min)
                    min = index;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

}
