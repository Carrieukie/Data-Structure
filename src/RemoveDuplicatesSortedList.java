/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 *
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode somehead = new ListNode(-1);
        somehead.next = head;
        ListNode prev = somehead;
        ListNode current = head;

        while(current != null){
            if(prev.val == current.val){
                current = current.next;
                prev.next = current;
            }else{

                prev = current;
                current = current.next;

            }
        }

        return head;

    }
}
