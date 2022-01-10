public class RemoveNthNode {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode next = listNode;
        for (int i = 1; i <= 4; i++) {
            next.next = new ListNode(i);
            next = next.next;
        }
        removeNthFromEnd(listNode,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 1; i<= n+1; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }

}

class ListNode {

    int val;
    ListNode next;


    ListNode(int val) {
        this.val = val;
    }

    static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


}
