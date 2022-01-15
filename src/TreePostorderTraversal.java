import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TreePostorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorderTraversal(arr, root);
        return arr;
    }

    public void preorderTraversal(List<Integer> arr, TreeNode root) {
        if (root == null) {
            return;
        }
        preorderTraversal(arr, root.left);
        preorderTraversal(arr, root.right);
        arr.add(root.val);

    }
}




