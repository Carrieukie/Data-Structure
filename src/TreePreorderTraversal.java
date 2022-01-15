import java.util.ArrayList;
import java.util.List;


public class TreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorderTraversal(arr, root);
        return arr;
    }

    public void preorderTraversal(List<Integer> arr, TreeNode root) {
        if (root == null) {
            return;
        }
        arr.add(root.val);
        preorderTraversal(arr, root.left);
        preorderTraversal(arr, root.right);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
