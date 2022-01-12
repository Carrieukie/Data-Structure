/**
 * Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */
public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("wewe", "hfevhjwew"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineChar = new int[26];
        for(char c: magazine.toCharArray()){
            magazineChar[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(magazineChar[c-'a']<1){
                return false;
            }
            magazineChar[c-'a']--;
        }
        return true;
    }
}
