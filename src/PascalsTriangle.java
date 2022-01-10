import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
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
