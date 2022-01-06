import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for (int n : nums){
            if (numbers.contains(n)){
                return true;
            }else {
                numbers.add(n);
            }
        }

        return numbers.size() != nums.length;

    }
}
