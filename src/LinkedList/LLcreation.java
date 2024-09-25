package LinkedList;

public class LLcreation {
    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        //list nodes
        // 1->2->3->4
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);

        //connect nodes
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        //print nodes
        while(head!=null){
            System.out.print(head.val+" -> ");
            head = head.next;
        }
    }
}
