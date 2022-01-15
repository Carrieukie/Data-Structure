import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TreeinorderTraversal {
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
        arr.add(root.val);
        preorderTraversal(arr, root.right);

    }
}




