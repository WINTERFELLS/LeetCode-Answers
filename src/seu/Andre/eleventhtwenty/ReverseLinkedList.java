package seu.Andre.eleventhtwenty;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode temp = cur;
            cur = temp.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }
}
