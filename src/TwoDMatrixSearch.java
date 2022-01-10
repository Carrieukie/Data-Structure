public class TwoDMatrixSearch {

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr,16));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int temp = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (temp == target) return true;
            else if (temp < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;

    }
}
