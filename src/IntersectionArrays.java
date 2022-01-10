import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 *
 */
public class IntersectionArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{3, 1, 2}, new int[]{1, 1})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int num : nums1.length < nums2.length ? nums1 : nums2) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : nums1.length < nums2.length ? nums2 : nums1){
            if (counts.get(num) != null && counts.get(num) > 0){
                ans.add(num);
                counts.put(num,counts.get(num) - 1);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
