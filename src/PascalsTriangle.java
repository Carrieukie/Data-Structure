import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 *      [1]
 *     [1, 1]
 *   [1, 2, 1]
 *  [1, 3, 3, 1]
 * [1, 4, 6, 4, 1]
 *
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 *
 * Constraints:
 *
 * 1 <= numRows <= 30
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        generate(30).forEach(System.out::println);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        for (int i = 0; i < numRows -1 ; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 0; j <= i - 1; j++) {
                int newInt = ans.get(i).get(j) + ans.get(i).get(j+1);
                newRow.add(newInt);
            }
            newRow.add(1);
            ans.add(newRow);
        }
        return ans;

    }
}
