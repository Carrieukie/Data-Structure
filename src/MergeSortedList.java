public class MergeSortedList {
    /**
     * You are given the heads of two sorted linked lists list1 and list2.
     *
     * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
     *
     * Return the head of the merged linked list.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     * Example 2:
     *
     * Input: list1 = [], list2 = []
     * Output: []
     * Example 3:
     *
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     *
     */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);

        ListNode tempHead = head;

        while(list1 != null || list2 != null) {
            // list1 is exhausted but not list2
            if(list1 == null) {
                tempHead.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            // list2 is exhausted but not list1
            else if(list2 == null) {
                tempHead.next = new ListNode(list1.val);
                list1 = list1.next;
            }

            else {
                if(list1.val <= list2.val) {
                    tempHead.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    tempHead.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }
            tempHead = tempHead.next;
        }

        return head.next;
    }
}
